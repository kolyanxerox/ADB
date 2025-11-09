package OoooOOO;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class oO0o0o implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ oO0O0OoO f14774OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14775OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ long f14776OooOo0o;

    public oO0o0o(oO0O0OoO oo0o0ooo, long j, int i) {
        this.f14775OooOo0O = i;
        switch (i) {
            case 1:
                this.f14776OooOo0o = j;
                Objects.requireNonNull(oo0o0ooo);
                this.f14774OooOo = oo0o0ooo;
                break;
            default:
                this.f14776OooOo0o = j;
                Objects.requireNonNull(oo0o0ooo);
                this.f14774OooOo = oo0o0ooo;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14775OooOo0O) {
            case 0:
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14774OooOo.f14574OooOo0O;
                o0O o0o = o0oo0oo0.f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o);
                o0O0o0 o0o0o0 = o0o.f14193Oooo000;
                long j = this.f14776OooOo0o;
                o0o0o0.OooO0O0(j);
                o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14401Oooo00o.OooO0OO(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                oO0O0OoO oo0o0ooo = this.f14774OooOo;
                oo0o0ooo.OooOO0O();
                oo0o0ooo.OooOO0o();
                o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
                o0O0O0o0 o0o0o0o02 = o0oo0oo02.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14401Oooo00o.OooO0O0("Resetting analytics data (FE)");
                oO0O0O00 oo0o0o00 = o0oo0oo02.f14521OooOoo;
                o0OO0oO0.OooOO0o(oo0o0o00);
                oo0o0o00.OooOO0O();
                oO0O0 oo0o0 = oo0o0o00.f14721OooOoOO;
                ((oO0O00oO) oo0o0.f14695OooOo).OooO0OO();
                ((o0OO0oO0) ((oO0O0O00) oo0o0.f14698OooOoO0).f14574OooOo0O).f14527Oooo000.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                oo0o0.f14696OooOo0O = jElapsedRealtime;
                oo0o0.f14697OooOo0o = jElapsedRealtime;
                o0oo0oo02.OooOOo().OooOOOo();
                boolean z = !o0oo0oo02.OooO0o();
                o0O o0o2 = o0oo0oo02.f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o2);
                o0o2.f14186OooOoOO.OooO0O0(this.f14776OooOo0o);
                o0OO0oO0 o0oo0oo03 = (o0OO0oO0) o0o2.f14574OooOo0O;
                o0O o0o3 = o0oo0oo03.f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o3);
                if (!TextUtils.isEmpty(o0o3.f14204OoooO00.OooO0Oo())) {
                    o0o2.f14204OoooO00.OooO0o0(null);
                }
                o0o2.f14197Oooo0OO.OooO0O0(0L);
                o0o2.f14199Oooo0o0.OooO0O0(0L);
                if (!o0oo0oo03.f14519OooOoO0.OooOo()) {
                    o0o2.OooOo00(z);
                }
                o0o2.f14203OoooO0.OooO0o0(null);
                o0o2.f14205OoooO0O.OooO0O0(0L);
                o0o2.f14202OoooO.OooOOO(null);
                oOo000o0 ooo000o0OooOOOo = o0oo0oo02.OooOOOo();
                ooo000o0OooOOOo.OooOO0O();
                ooo000o0OooOOOo.OooOO0o();
                oOO0 ooo0OooOoOO = ooo000o0OooOOOo.OooOoOO(false);
                ooo000o0OooOOOo.OooOo0o();
                ((o0OO0oO0) ooo000o0OooOOOo.f14574OooOo0O).OooOOOO().OooOOOO();
                ooo000o0OooOOOo.OooOoO0(new oOo00o0o(ooo000o0OooOOOo, ooo0OooOoOO, 0));
                o0OO0oO0.OooOO0o(oo0o0o00);
                oo0o0o00.f14719OooOoO.OooO();
                oo0o0ooo.f14742Oooo0oO = z;
                o0oo0oo02.OooOOOo().OooOOOO(new AtomicReference());
                break;
        }
    }
}
