package Oooo;

import OooOooo.o000O00O;
import OooOooo.o000O0Oo;
import Oooo000.OooO0O0;
import Oooo000.OooO0o;
import Oooooo.o0OOO0o;
import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import o000OOoO.OooO;

/* loaded from: classes2.dex */
public final class Oooo0 extends Oooo000.OooOO0 implements AppSetIdClient {

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final OooO0oO.OooOOO0 f13714Oooo000 = new OooO0oO.OooOOO0("AppSet.API", new OooOo(0), new OooO(5));

    /* renamed from: OooOooO, reason: collision with root package name */
    public final Context f13715OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final o000O0Oo f13716OooOooo;

    public Oooo0(Context context, o000O0Oo o000o0oo2) {
        super(context, f13714Oooo000, OooO0O0.f13722OooO00o, Oooo000.OooO.f13720OooO0O0);
        this.f13715OooOooO = context;
        this.f13716OooOooo = o000o0oo2;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        if (this.f13716OooOooo.OooO0OO(this.f13715OooOooO, 212800000) != 0) {
            return Tasks.forException(new OooO0o(new Status(17, null, null, null)));
        }
        o0OOO0o o0ooo0o = new o0OOO0o();
        o0ooo0o.f15087OooO0Oo = new o000O00O[]{zze.zza};
        o0ooo0o.f15086OooO0OO = new o000000.OooO(this);
        o0ooo0o.f15084OooO00o = false;
        o0ooo0o.f15085OooO0O0 = 27601;
        return OooO0O0(0, new o0OOO0o(o0ooo0o, (o000O00O[]) o0ooo0o.f15087OooO0Oo, o0ooo0o.f15084OooO00o, o0ooo0o.f15085OooO0O0));
    }
}
