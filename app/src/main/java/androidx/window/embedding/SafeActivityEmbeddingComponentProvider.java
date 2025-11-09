package androidx.window.embedding;

import android.app.Activity;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class SafeActivityEmbeddingComponentProvider {
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;
    private final WindowExtensions windowExtensions;

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isActivityEmbeddingComponentValid$1 */
    public static final class C08441 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08441() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            Method getActivityEmbeddingComponentMethod = SafeActivityEmbeddingComponentProvider.this.safeWindowExtensionsProvider.getWindowExtensionsClass$window_release().getMethod("getActivityEmbeddingComponent", null);
            Class<?> activityEmbeddingComponentClass = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(getActivityEmbeddingComponentMethod, "getActivityEmbeddingComponentMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(getActivityEmbeddingComponentMethod) && reflectionUtils.doesReturn$window_release(getActivityEmbeddingComponentMethod, activityEmbeddingComponentClass));
        }
    }

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodClearSplitInfoCallbackValid$1 */
    public static final class C08451 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08451() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            Method clearSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("clearSplitInfoCallback", null);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(clearSplitInfoCallbackMethod, "clearSplitInfoCallbackMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(clearSplitInfoCallbackMethod));
        }
    }

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodIsActivityEmbeddedValid$1 */
    public static final class C08461 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08461() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            Method isActivityEmbeddedMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("isActivityEmbedded", Activity.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(isActivityEmbeddedMethod, "isActivityEmbeddedMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(isActivityEmbeddedMethod) && reflectionUtils.doesReturn$window_release(isActivityEmbeddedMethod, Boolean.TYPE));
        }
    }

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSetEmbeddingRulesValid$1 */
    public static final class C08471 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08471() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            Method setEmbeddingRulesMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setEmbeddingRules", Set.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(setEmbeddingRulesMethod, "setEmbeddingRulesMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(setEmbeddingRulesMethod));
        }
    }

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSetSplitInfoCallbackJavaConsumerValid$1 */
    public static final class C08481 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08481() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            Class<?> clsConsumerClassOrNull$window_release = SafeActivityEmbeddingComponentProvider.this.consumerAdapter.consumerClassOrNull$window_release();
            if (clsConsumerClassOrNull$window_release == null) {
                return Boolean.FALSE;
            }
            Method setSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", clsConsumerClassOrNull$window_release);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(setSplitInfoCallbackMethod, "setSplitInfoCallbackMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(setSplitInfoCallbackMethod));
        }
    }

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSetSplitInfoCallbackWindowConsumerValid$1 */
    public static final class C08491 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08491() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            Method setSplitInfoCallbackMethod = SafeActivityEmbeddingComponentProvider.this.getActivityEmbeddingComponentClass().getMethod("setSplitInfoCallback", Consumer.class);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(setSplitInfoCallbackMethod, "setSplitInfoCallbackMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(setSplitInfoCallbackMethod));
        }
    }

    /* renamed from: androidx.window.embedding.SafeActivityEmbeddingComponentProvider$isMethodSplitAttributesCalculatorValid$1 */
    public static final class C08501 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C08501() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        @Override // o00O0Oo.OooO0O0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
            /*
                r4 = this;
                androidx.window.embedding.SafeActivityEmbeddingComponentProvider r0 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this
                java.lang.Class r0 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.access$getActivityEmbeddingComponentClass(r0)
                java.lang.Class<androidx.window.extensions.core.util.function.Function> r1 = androidx.window.extensions.core.util.function.Function.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1}
                java.lang.String r2 = "setSplitAttributesCalculator"
                java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
                androidx.window.embedding.SafeActivityEmbeddingComponentProvider r1 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.this
                java.lang.Class r1 = androidx.window.embedding.SafeActivityEmbeddingComponentProvider.access$getActivityEmbeddingComponentClass(r1)
                java.lang.String r2 = "clearSplitAttributesCalculator"
                r3 = 0
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)
                androidx.window.reflection.ReflectionUtils r2 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r3 = "setSplitAttributesCalculatorMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r3)
                boolean r0 = r2.isPublic$window_release(r0)
                if (r0 == 0) goto L39
                java.lang.String r0 = "clearSplitAttributesCalculatorMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r1, r0)
                boolean r0 = r2.isPublic$window_release(r1)
                if (r0 == 0) goto L39
                r0 = 1
                goto L3a
            L39:
                r0 = 0
            L3a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SafeActivityEmbeddingComponentProvider.C08501.invoke():java.lang.Boolean");
        }
    }

    public SafeActivityEmbeddingComponentProvider(ClassLoader loader, ConsumerAdapter consumerAdapter, WindowExtensions windowExtensions) {
        OooOo.OooO0o0(loader, "loader");
        OooOo.OooO0o0(consumerAdapter, "consumerAdapter");
        OooOo.OooO0o0(windowExtensions, "windowExtensions");
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
        this.windowExtensions = windowExtensions;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(loader);
    }

    private final boolean canUseActivityEmbeddingComponent() {
        if (!isActivityEmbeddingComponentAccessible$window_release()) {
            return false;
        }
        int safeVendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
        if (safeVendorApiLevel == 1) {
            return hasValidVendorApiLevel1$window_release();
        }
        if (2 > safeVendorApiLevel || safeVendorApiLevel > Integer.MAX_VALUE) {
            return false;
        }
        return hasValidVendorApiLevel2$window_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getActivityEmbeddingComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.ACTIVITY_EMBEDDING_COMPONENT_CLASS);
        OooOo.OooO0Oo(clsLoadClass, "loader.loadClass(ACTIVIT…MBEDDING_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean isActivityEmbeddingComponentValid() {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getActivityEmbeddingComponent is not valid", new C08441());
    }

    private final boolean isMethodClearSplitInfoCallbackValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new C08451());
    }

    private final boolean isMethodIsActivityEmbeddedValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new C08461());
    }

    private final boolean isMethodSetEmbeddingRulesValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new C08471());
    }

    private final boolean isMethodSetSplitInfoCallbackJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new C08481());
    }

    private final boolean isMethodSetSplitInfoCallbackWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new C08491());
    }

    private final boolean isMethodSplitAttributesCalculatorValid() {
        return ReflectionUtils.validateReflection$window_release("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new C08501());
    }

    public final ActivityEmbeddingComponent getActivityEmbeddingComponent() {
        if (!canUseActivityEmbeddingComponent()) {
            return null;
        }
        try {
            return this.windowExtensions.getActivityEmbeddingComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean hasValidVendorApiLevel1$window_release() {
        return isMethodSetEmbeddingRulesValid() && isMethodIsActivityEmbeddedValid() && isMethodSetSplitInfoCallbackJavaConsumerValid();
    }

    public final boolean hasValidVendorApiLevel2$window_release() {
        return hasValidVendorApiLevel1$window_release() && isMethodSetSplitInfoCallbackWindowConsumerValid() && isMethodClearSplitInfoCallbackValid() && isMethodSplitAttributesCalculatorValid();
    }

    public final boolean isActivityEmbeddingComponentAccessible$window_release() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window_release() && isActivityEmbeddingComponentValid();
    }
}
