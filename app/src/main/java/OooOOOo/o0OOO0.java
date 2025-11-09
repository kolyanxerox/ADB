package OoooOOO;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0OOO0 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f14544OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14545OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f14546OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f14547OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ long f14548OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ Object f14549OooOoOO;

    public o0OOO0(o0OOo000 o0ooo000, String str, String str2, String str3, long j) {
        this.f14546OooOo0o = str;
        this.f14544OooOo = str2;
        this.f14547OooOoO = str3;
        this.f14548OooOoO0 = j;
        Objects.requireNonNull(o0ooo000);
        this.f14549OooOoOO = o0ooo000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14545OooOo0O) {
            case 0:
                String str = (String) this.f14544OooOo;
                o0OOo000 o0ooo000 = (o0OOo000) this.f14549OooOoOO;
                String str2 = (String) this.f14546OooOo0o;
                if (str2 != null) {
                    oO00OOo0 oo00ooo0 = new oO00OOo0(this.f14548OooOoO0, (String) this.f14547OooOoO, str2);
                    oOO0000 ooo0000 = o0ooo000.f14568OooOo0O;
                    ooo0000.OooO0O0().OooOO0O();
                    String str3 = ooo0000.f14823Ooooo00;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    ooo0000.f14823Ooooo00 = str;
                    ooo0000.f14822OoooOoo = oo00ooo0;
                    break;
                } else {
                    oOO0000 ooo00002 = o0ooo000.f14568OooOo0O;
                    ooo00002.OooO0O0().OooOO0O();
                    String str4 = ooo00002.f14823Ooooo00;
                    if (str4 == null || str4.equals(str)) {
                        ooo00002.f14823Ooooo00 = str;
                        ooo00002.f14822OoooOoo = null;
                        break;
                    }
                }
                break;
            case 1:
                Object obj = this.f14547OooOoO;
                ((oO0O0OoO) this.f14549OooOoOO).OooOo0O(this.f14548OooOoO0, obj, (String) this.f14546OooOo0o, (String) this.f14544OooOo);
                break;
            default:
                oO00o000 oo00o000 = (oO00o000) this.f14549OooOoOO;
                oo00o000.getClass();
                Bundle bundle = (Bundle) this.f14546OooOo0o;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                oOO00OO ooo00oo = ((o0OO0oO0) oo00o000.f14574OooOo0O).f14523OooOooO;
                o0OO0oO0.OooOO0O(ooo00oo);
                oo00o000.OooOo0((oO00OOo0) this.f14544OooOo, (oO00OOo0) this.f14547OooOoO, this.f14548OooOoO0, true, ooo00oo.OooOOoo("screen_view", bundle, null, false));
                break;
        }
    }

    public o0OOO0(oO0O0OoO oo0o0ooo, String str, String str2, Object obj, long j) {
        this.f14546OooOo0o = str;
        this.f14544OooOo = str2;
        this.f14547OooOoO = obj;
        this.f14548OooOoO0 = j;
        Objects.requireNonNull(oo0o0ooo);
        this.f14549OooOoOO = oo0o0ooo;
    }

    public o0OOO0(oO00o000 oo00o000, Bundle bundle, oO00OOo0 oo00ooo0, oO00OOo0 oo00ooo02, long j) {
        this.f14546OooOo0o = bundle;
        this.f14544OooOo = oo00ooo0;
        this.f14547OooOoO = oo00ooo02;
        this.f14548OooOoO0 = j;
        Objects.requireNonNull(oo00o000);
        this.f14549OooOoOO = oo00o000;
    }
}
