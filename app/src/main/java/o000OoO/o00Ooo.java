package o000Ooo;

import java.util.Objects;
import o000O0Oo.OooO0o;

/* loaded from: classes2.dex */
public final class o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0 f30484OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0 f30485OooO0O0;

    public o00Ooo(o00000O0 o00000o02, OooO0o oooO0o) {
        this.f30484OooO00o = o00000o02;
        this.f30485OooO0O0 = new o00Oo0(oooO0o);
    }

    public final void OooO00o(String str) {
        o00Oo0 o00oo0 = this.f30485OooO0O0;
        synchronized (o00oo0) {
            if (!Objects.equals(o00oo0.f30482OooO0O0, str)) {
                o00Oo0.OooO00o(o00oo0.f30481OooO00o, str, o00oo0.f30483OooO0OO);
                o00oo0.f30482OooO0O0 = str;
            }
        }
    }
}
