package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.SafeWindowExtensionsProvider;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.reflection.ReflectionUtils;
import androidx.window.reflection.WindowExtensionsConstants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class SafeWindowLayoutComponentProvider {
    private final ConsumerAdapter consumerAdapter;
    private final ClassLoader loader;
    private final SafeWindowExtensionsProvider safeWindowExtensionsProvider;

    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 */
    public static final class C08551 extends Oooo000 implements OooO0O0 {
        public C08551() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
        @Override // o00O0Oo.OooO0O0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                r5 = this;
                androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                java.lang.Class r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getFoldingFeatureClass(r0)
                java.lang.String r1 = "getBounds"
                r2 = 0
                java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                java.lang.String r3 = "getType"
                java.lang.reflect.Method r3 = r0.getMethod(r3, r2)
                java.lang.String r4 = "getState"
                java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
                androidx.window.reflection.ReflectionUtils r2 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r4 = "getBoundsMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r1, r4)
                java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                kotlin.jvm.internal.OooOO0 r4 = kotlin.jvm.internal.o0OO00O.OooO00o(r4)
                boolean r4 = r2.doesReturn$window_release(r1, r4)
                if (r4 == 0) goto L60
                boolean r1 = r2.isPublic$window_release(r1)
                if (r1 == 0) goto L60
                java.lang.String r1 = "getTypeMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r3, r1)
                java.lang.Class r1 = java.lang.Integer.TYPE
                kotlin.jvm.internal.OooOO0 r4 = kotlin.jvm.internal.o0OO00O.OooO00o(r1)
                boolean r4 = r2.doesReturn$window_release(r3, r4)
                if (r4 == 0) goto L60
                boolean r3 = r2.isPublic$window_release(r3)
                if (r3 == 0) goto L60
                java.lang.String r3 = "getStateMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r3)
                kotlin.jvm.internal.OooOO0 r1 = kotlin.jvm.internal.o0OO00O.OooO00o(r1)
                boolean r1 = r2.doesReturn$window_release(r0, r1)
                if (r1 == 0) goto L60
                boolean r0 = r2.isPublic$window_release(r0)
                if (r0 == 0) goto L60
                r0 = 1
                goto L61
            L60:
                r0 = 0
            L61:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C08551.invoke():java.lang.Boolean");
        }
    }

    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isMethodWindowLayoutInfoListenerJavaConsumerValid$1 */
    public static final class C08561 extends Oooo000 implements OooO0O0 {
        public C08561() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
        @Override // o00O0Oo.OooO0O0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                r4 = this;
                androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                androidx.window.core.ConsumerAdapter r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getConsumerAdapter$p(r0)
                java.lang.Class r0 = r0.consumerClassOrNull$window_release()
                if (r0 != 0) goto Lf
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            Lf:
                androidx.window.layout.SafeWindowLayoutComponentProvider r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                java.lang.Class r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getWindowLayoutComponentClass(r1)
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2, r0}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r2 = r1.getMethod(r3, r2)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                java.lang.reflect.Method r0 = r1.getMethod(r3, r0)
                androidx.window.reflection.ReflectionUtils r1 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r3 = "addListenerMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r2, r3)
                boolean r2 = r1.isPublic$window_release(r2)
                if (r2 == 0) goto L45
                java.lang.String r2 = "removeListenerMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r2)
                boolean r0 = r1.isPublic$window_release(r0)
                if (r0 == 0) goto L45
                r0 = 1
                goto L46
            L45:
                r0 = 0
            L46:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C08561.invoke():java.lang.Boolean");
        }
    }

    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isMethodWindowLayoutInfoListenerWindowConsumerValid$1 */
    public static final class C08571 extends Oooo000 implements OooO0O0 {
        public C08571() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
        @Override // o00O0Oo.OooO0O0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
            /*
                r4 = this;
                androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.this
                java.lang.Class r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$getWindowLayoutComponentClass(r0)
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                java.lang.Class<androidx.window.extensions.core.util.function.Consumer> r2 = androidx.window.extensions.core.util.function.Consumer.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r1 = r0.getMethod(r3, r1)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                androidx.window.reflection.ReflectionUtils r2 = androidx.window.reflection.ReflectionUtils.INSTANCE
                java.lang.String r3 = "addListenerMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r1, r3)
                boolean r1 = r2.isPublic$window_release(r1)
                if (r1 == 0) goto L38
                java.lang.String r1 = "removeListenerMethod"
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r1)
                boolean r0 = r2.isPublic$window_release(r0)
                if (r0 == 0) goto L38
                r0 = 1
                goto L39
            L38:
                r0 = 0
            L39:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C08571.invoke():java.lang.Boolean");
        }
    }

    /* renamed from: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 */
    public static final class C08581 extends Oooo000 implements OooO0O0 {
        public C08581() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            Method getWindowLayoutComponentMethod = SafeWindowLayoutComponentProvider.this.safeWindowExtensionsProvider.getWindowExtensionsClass$window_release().getMethod("getWindowLayoutComponent", null);
            Class<?> windowLayoutComponentClass = SafeWindowLayoutComponentProvider.this.getWindowLayoutComponentClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            OooOo.OooO0Oo(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(reflectionUtils.isPublic$window_release(getWindowLayoutComponentMethod) && reflectionUtils.doesReturn$window_release(getWindowLayoutComponentMethod, windowLayoutComponentClass));
        }
    }

    public SafeWindowLayoutComponentProvider(ClassLoader loader, ConsumerAdapter consumerAdapter) {
        OooOo.OooO0o0(loader, "loader");
        OooOo.OooO0o0(consumerAdapter, "consumerAdapter");
        this.loader = loader;
        this.consumerAdapter = consumerAdapter;
        this.safeWindowExtensionsProvider = new SafeWindowExtensionsProvider(loader);
    }

    private final boolean canUseWindowLayoutComponent() {
        if (!isWindowLayoutComponentAccessible$window_release()) {
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
    public final Class<?> getFoldingFeatureClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.FOLDING_FEATURE_CLASS);
        OooOo.OooO0Oo(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return clsLoadClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowLayoutComponentClass() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.loader.loadClass(WindowExtensionsConstants.WINDOW_LAYOUT_COMPONENT_CLASS);
        OooOo.OooO0Oo(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    private final boolean isFoldingFeatureValid() {
        return ReflectionUtils.validateReflection$window_release("FoldingFeature class is not valid", new C08551());
    }

    private final boolean isMethodWindowLayoutInfoListenerJavaConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C08561());
    }

    private final boolean isMethodWindowLayoutInfoListenerWindowConsumerValid() {
        return ReflectionUtils.validateReflection$window_release("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C08571());
    }

    private final boolean isWindowLayoutProviderValid() {
        return ReflectionUtils.validateReflection$window_release("WindowExtensions#getWindowLayoutComponent is not valid", new C08581());
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        if (!canUseWindowLayoutComponent()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean hasValidVendorApiLevel1$window_release() {
        return isMethodWindowLayoutInfoListenerJavaConsumerValid();
    }

    public final boolean hasValidVendorApiLevel2$window_release() {
        return hasValidVendorApiLevel1$window_release() && isMethodWindowLayoutInfoListenerWindowConsumerValid();
    }

    public final boolean isWindowLayoutComponentAccessible$window_release() {
        return this.safeWindowExtensionsProvider.isWindowExtensionsValid$window_release() && isWindowLayoutProviderValid() && isFoldingFeatureValid();
    }
}
