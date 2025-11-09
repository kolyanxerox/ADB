package androidx.window;

import androidx.window.reflection.ReflectionUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class SafeWindowExtensionsProvider$isWindowExtensionsValid$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ SafeWindowExtensionsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowExtensionsProvider$isWindowExtensionsValid$1(SafeWindowExtensionsProvider safeWindowExtensionsProvider) {
        super(0);
        this.this$0 = safeWindowExtensionsProvider;
    }

    @Override // o00O0Oo.OooO0O0
    public final Boolean invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method getWindowExtensionsMethod = this.this$0.getWindowExtensionsProviderClass().getDeclaredMethod("getWindowExtensions", null);
        Class<?> windowExtensionsClass$window_release = this.this$0.getWindowExtensionsClass$window_release();
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        OooOo.OooO0Oo(getWindowExtensionsMethod, "getWindowExtensionsMethod");
        return Boolean.valueOf(reflectionUtils.doesReturn$window_release(getWindowExtensionsMethod, windowExtensionsClass$window_release) && reflectionUtils.isPublic$window_release(getWindowExtensionsMethod));
    }
}
