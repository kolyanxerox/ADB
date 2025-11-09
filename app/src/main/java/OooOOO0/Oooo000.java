package OooOOo0;

import OooOOoo.o0000OO0;
import OooOOoo.o000OO;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.ads.C1386ai;
import o00O00oO.o0000O0;

/* loaded from: classes2.dex */
public final class Oooo000 {

    /* renamed from: OooO00o */
    public Context f13505OooO00o;

    public Oooo0 OooO00o() {
        Context context = this.f13505OooO00o;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        Oooo0 oooo0 = new Oooo0();
        oooo0.f13500OooOo0O = o000OO.OooO00o(o0OoOo0.f13527OooO00o);
        o0000OO0 o0000oo02 = new o0000OO0(context, 0);
        oooo0.f13501OooOo0o = o0000oo02;
        oooo0.f13499OooOo = o000OO.OooO00o(new OooO0oO.OooOOO0(o0000oo02, false, new OooOOo.OooOo(o0000oo02, 0), 4));
        o0000OO0 o0000oo03 = oooo0.f13501OooOo0o;
        oooo0.f13503OooOoO0 = new OooOOo.OooOo(o0000oo03, 2);
        o0000O0 o0000o0OooO00o = o000OO.OooO00o(new OooO0oO.OooOOO0(oooo0.f13503OooOoO0, false, o000OO.OooO00o(new OooOOo.OooOo(o0000oo03, 1)), 5));
        oooo0.f13502OooOoO = o0000o0OooO00o;
        o000OOoO.OooO oooO = new o000OOoO.OooO(3);
        o0000OO0 o0000oo04 = oooo0.f13501OooOo0o;
        Oooo.OooOo00 oooOo00 = new Oooo.OooOo00(o0000oo04, o0000o0OooO00o, oooO, 3);
        o0000O0 o0000o02 = oooo0.f13500OooOo0O;
        o0000O0 o0000o03 = oooo0.f13499OooOo;
        oooo0.f13504OooOoOO = o000OO.OooO00o(new Oooo.OooOo00(new o0OOO0o(o0000o02, o0000o03, oooOo00, o0000o0OooO00o, o0000o0OooO00o, 1), new o000O0Oo.OooO0o(o0000oo04, o0000o03, o0000o0OooO00o, oooOo00, o0000o02, o0000o0OooO00o, o0000o0OooO00o, 1), new C1386ai(o0000o02, o0000o0OooO00o, oooOo00, o0000o0OooO00o, 2), 2));
        return oooo0;
    }

    public ApplicationInfo OooO0O0(int i, String str) {
        return this.f13505OooO00o.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo OooO0OO(int i, String str) {
        return this.f13505OooO00o.getPackageManager().getPackageInfo(str, i);
    }

    public boolean OooO0Oo() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f13505OooO00o;
        if (callingUid == iMyUid) {
            return Oooo0o0.OooO.OooOOo0(context);
        }
        if (!Oooo0OO.o00oO0o.OooO0oo() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
