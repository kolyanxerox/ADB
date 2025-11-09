package o00Oo0;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class OooOo00 implements OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Long f32656OooO00o;

    @Override // o00Oo0.OooOo
    public final boolean isSupported() throws NoSuchMethodException, SecurityException {
        if (this.f32656OooO00o == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.f32656OooO00o = l;
            } catch (Exception unused) {
                this.f32656OooO00o = -1L;
            }
        }
        return this.f32656OooO00o.longValue() >= 40100;
    }
}
