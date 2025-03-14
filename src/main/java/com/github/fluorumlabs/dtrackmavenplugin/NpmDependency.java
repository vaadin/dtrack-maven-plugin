// Generated by delombok at Thu Mar 13 15:00:40 CET 2025
/*
 * Copyright 2021 Artem Godin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.fluorumlabs.dtrackmavenplugin;

import com.github.fluorumlabs.dtrackmavenplugin.engine.NpmReactor;
import io.github.classgraph.*;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Parameter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

public class NpmDependency {
    /**
     * Explicit NPM dependency package name
     */
    @Parameter
    private String packageName;
    /**
     * Explicit NPM dependency version
     */
    @Parameter
    private String version;
    /**
     * Annotation class name to extract NPM dependency information.
     */
    @Parameter
    private String annotationClassName;
    /**
     * Annotation field name holding NPM package name.
     */
    @Parameter
    private String annotationPackageNameField;
    /**
     * Annotation field name holding NPM package version.
     */
    @Parameter
    private String annotationVersionField;
    /**
     * Declaring class name of a static method without parameters returning
     * Map&lt;String,String&gt; with package names as a keys and versions as a
     * values.
     */
    @Parameter
    private String staticMethodClassName;
    /**
     * Name of static method without parameters returning Map&lt;String,String&gt;
     * with package names as a keys and versions as a values.
     */
    @Parameter
    private String staticMethodName;

    public boolean addToReactor(URL[] classLoaderURLs, Log logger, NpmReactor reactor) {
        if (isPackageReference()) {
            reactor.addDependency(packageName, version);
            return true;
        } else if (isAnnotationReference()) {
            return scanAnnotations(classLoaderURLs, reactor);
        } else if (isStaticMethodReference()) {
            return invokeMethod(classLoaderURLs, logger, reactor);
        }
        return false;
    }

    private boolean isPackageReference() {
        return packageName != null && version != null;
    }

    private boolean isAnnotationReference() {
        return annotationClassName != null && annotationPackageNameField != null && annotationVersionField != null;
    }

    private boolean isStaticMethodReference() {
        return staticMethodClassName != null && staticMethodName != null;
    }

    @SuppressWarnings("unchecked")
    private boolean invokeMethod(URL[] classLoaderURLs, Log logger, NpmReactor npmReactor) {
        boolean wasAdded = false;
        try (URLClassLoader classLoader = new URLClassLoader(classLoaderURLs, getClass().getClassLoader())) {
            Class<?> aClass = classLoader.loadClass(staticMethodClassName);
            Method declaredMethod = aClass.getDeclaredMethod(staticMethodName);
            declaredMethod.setAccessible(true);
            Object result = declaredMethod.invoke(null);
            if (result == null) {
                logger.error("Method returned null: " + staticMethodClassName + "." + staticMethodName + "()");
                return false;
            }
            if (result instanceof Map) {
                Map<String, String> mappedResult = (Map<String, String>) result;
                for (Map.Entry<String, String> stringStringEntry : mappedResult.entrySet()) {
                    if (stringStringEntry.getKey() instanceof String && stringStringEntry.getValue() instanceof String) {
                        npmReactor.addDependency(stringStringEntry.getKey(), stringStringEntry.getValue());
                        wasAdded = true;
                    } else {
                        logger.error("Method " + staticMethodClassName + "." + staticMethodName + " returned unsupported value " + stringStringEntry.getKey() + " -> " + stringStringEntry.getValue());
                    }
                }
            }
        } catch (Exception e) {
            logger.debug("Error invoking " + staticMethodClassName + "." + staticMethodName + "()", e);
        }
        return wasAdded;
    }

    private boolean scanAnnotations(URL[] classLoaderURLs, NpmReactor npmReactor) {
        boolean wasAdded = false;
        try (ScanResult scanResult = new ClassGraph().enableAllInfo().acceptPackages("*").overrideClassLoaders(new URLClassLoader(classLoaderURLs)).scan()) {
            ClassInfoList classesWithAnnotation = scanResult.getClassesWithAnnotation(annotationClassName);
            for (ClassInfo classInfo : classesWithAnnotation) {
                for (AnnotationInfo annotationInfo : classInfo.getAnnotationInfoRepeatable(annotationClassName)) {
                    AnnotationParameterValueList parameterValues = annotationInfo.getParameterValues();
                    String actualPackageName = (String) parameterValues.getValue(annotationPackageNameField);
                    String actualVersion = (String) parameterValues.getValue(annotationVersionField);
                    if (actualPackageName != null && actualVersion != null && !actualPackageName.isEmpty() && !actualVersion.isEmpty()) {
                        npmReactor.addDependency(actualPackageName, actualVersion);
                        wasAdded = true;
                    }
                }
            }
        }
        return wasAdded;
    }

    /**
     * Explicit NPM dependency package name
     */
    @java.lang.SuppressWarnings("all")
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * Explicit NPM dependency version
     */
    @java.lang.SuppressWarnings("all")
    public String getVersion() {
        return this.version;
    }

    /**
     * Annotation class name to extract NPM dependency information.
     */
    @java.lang.SuppressWarnings("all")
    public String getAnnotationClassName() {
        return this.annotationClassName;
    }

    /**
     * Annotation field name holding NPM package name.
     */
    @java.lang.SuppressWarnings("all")
    public String getAnnotationPackageNameField() {
        return this.annotationPackageNameField;
    }

    /**
     * Annotation field name holding NPM package version.
     */
    @java.lang.SuppressWarnings("all")
    public String getAnnotationVersionField() {
        return this.annotationVersionField;
    }

    /**
     * Declaring class name of a static method without parameters returning
     * Map&lt;String,String&gt; with package names as a keys and versions as a
     * values.
     */
    @java.lang.SuppressWarnings("all")
    public String getStaticMethodClassName() {
        return this.staticMethodClassName;
    }

    /**
     * Name of static method without parameters returning Map&lt;String,String&gt;
     * with package names as a keys and versions as a values.
     */
    @java.lang.SuppressWarnings("all")
    public String getStaticMethodName() {
        return this.staticMethodName;
    }

    /**
     * Explicit NPM dependency package name
     */
    @java.lang.SuppressWarnings("all")
    public void setPackageName(final String packageName) {
        this.packageName = packageName;
    }

    /**
     * Explicit NPM dependency version
     */
    @java.lang.SuppressWarnings("all")
    public void setVersion(final String version) {
        this.version = version;
    }

    /**
     * Annotation class name to extract NPM dependency information.
     */
    @java.lang.SuppressWarnings("all")
    public void setAnnotationClassName(final String annotationClassName) {
        this.annotationClassName = annotationClassName;
    }

    /**
     * Annotation field name holding NPM package name.
     */
    @java.lang.SuppressWarnings("all")
    public void setAnnotationPackageNameField(final String annotationPackageNameField) {
        this.annotationPackageNameField = annotationPackageNameField;
    }

    /**
     * Annotation field name holding NPM package version.
     */
    @java.lang.SuppressWarnings("all")
    public void setAnnotationVersionField(final String annotationVersionField) {
        this.annotationVersionField = annotationVersionField;
    }

    /**
     * Declaring class name of a static method without parameters returning
     * Map&lt;String,String&gt; with package names as a keys and versions as a
     * values.
     */
    @java.lang.SuppressWarnings("all")
    public void setStaticMethodClassName(final String staticMethodClassName) {
        this.staticMethodClassName = staticMethodClassName;
    }

    /**
     * Name of static method without parameters returning Map&lt;String,String&gt;
     * with package names as a keys and versions as a values.
     */
    @java.lang.SuppressWarnings("all")
    public void setStaticMethodName(final String staticMethodName) {
        this.staticMethodName = staticMethodName;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof NpmDependency)) return false;
        final NpmDependency other = (NpmDependency) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$packageName = this.getPackageName();
        final java.lang.Object other$packageName = other.getPackageName();
        if (this$packageName == null ? other$packageName != null : !this$packageName.equals(other$packageName)) return false;
        final java.lang.Object this$version = this.getVersion();
        final java.lang.Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final java.lang.Object this$annotationClassName = this.getAnnotationClassName();
        final java.lang.Object other$annotationClassName = other.getAnnotationClassName();
        if (this$annotationClassName == null ? other$annotationClassName != null : !this$annotationClassName.equals(other$annotationClassName)) return false;
        final java.lang.Object this$annotationPackageNameField = this.getAnnotationPackageNameField();
        final java.lang.Object other$annotationPackageNameField = other.getAnnotationPackageNameField();
        if (this$annotationPackageNameField == null ? other$annotationPackageNameField != null : !this$annotationPackageNameField.equals(other$annotationPackageNameField)) return false;
        final java.lang.Object this$annotationVersionField = this.getAnnotationVersionField();
        final java.lang.Object other$annotationVersionField = other.getAnnotationVersionField();
        if (this$annotationVersionField == null ? other$annotationVersionField != null : !this$annotationVersionField.equals(other$annotationVersionField)) return false;
        final java.lang.Object this$staticMethodClassName = this.getStaticMethodClassName();
        final java.lang.Object other$staticMethodClassName = other.getStaticMethodClassName();
        if (this$staticMethodClassName == null ? other$staticMethodClassName != null : !this$staticMethodClassName.equals(other$staticMethodClassName)) return false;
        final java.lang.Object this$staticMethodName = this.getStaticMethodName();
        final java.lang.Object other$staticMethodName = other.getStaticMethodName();
        if (this$staticMethodName == null ? other$staticMethodName != null : !this$staticMethodName.equals(other$staticMethodName)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof NpmDependency;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $packageName = this.getPackageName();
        result = result * PRIME + ($packageName == null ? 43 : $packageName.hashCode());
        final java.lang.Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final java.lang.Object $annotationClassName = this.getAnnotationClassName();
        result = result * PRIME + ($annotationClassName == null ? 43 : $annotationClassName.hashCode());
        final java.lang.Object $annotationPackageNameField = this.getAnnotationPackageNameField();
        result = result * PRIME + ($annotationPackageNameField == null ? 43 : $annotationPackageNameField.hashCode());
        final java.lang.Object $annotationVersionField = this.getAnnotationVersionField();
        result = result * PRIME + ($annotationVersionField == null ? 43 : $annotationVersionField.hashCode());
        final java.lang.Object $staticMethodClassName = this.getStaticMethodClassName();
        result = result * PRIME + ($staticMethodClassName == null ? 43 : $staticMethodClassName.hashCode());
        final java.lang.Object $staticMethodName = this.getStaticMethodName();
        result = result * PRIME + ($staticMethodName == null ? 43 : $staticMethodName.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "NpmDependency(packageName=" + this.getPackageName() + ", version=" + this.getVersion() + ", annotationClassName=" + this.getAnnotationClassName() + ", annotationPackageNameField=" + this.getAnnotationPackageNameField() + ", annotationVersionField=" + this.getAnnotationVersionField() + ", staticMethodClassName=" + this.getStaticMethodClassName() + ", staticMethodName=" + this.getStaticMethodName() + ")";
    }

    @java.lang.SuppressWarnings("all")
    public NpmDependency() {
    }
}
