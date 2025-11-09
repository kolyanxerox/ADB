package o0000o0O;

import Oooo00O.o000000O;
import OoooOOO.oO0000O;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.ironsource.C3037dc;
import java.util.ArrayList;
import o0000Ooo.o0O00o0;
import o0000oO0.Oooo0;
import o0000oO0.Oooo000;
import o0000oO0.o000oOoO;
import o0000oOO.o0O000o0;
import o000Oo00.OooOOO;

/* loaded from: classes2.dex */
public final class OooOO0 {

    /* renamed from: OooO00o */
    public final OooOOO f29619OooO00o;

    /* renamed from: OooO0O0 */
    public Integer f29620OooO0O0 = null;

    public OooOO0(OooOOO oooOOO) {
        this.f29619OooO00o = oooOOO;
    }

    public static boolean OooO00o(ArrayList arrayList, OooO oooO) {
        String str = oooO.f29613OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            OooO oooO2 = (OooO) obj;
            if (oooO2.f29613OooO00o.equals(str) && oooO2.f29614OooO0O0.equals(oooO.f29614OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList OooO0O0() {
        o000oOoO o000oooo2 = (o000oOoO) ((Oooo0) this.f29619OooO00o.get());
        o000oooo2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((o00O00OO) o000oooo2.f29640OooO00o.f30487OooOo0o).OooO0o("frc", "")) {
            o0O00o0 o0o00o0 = o0O000o0.f29646OooO00o;
            o000000O.OooO0oo(bundle);
            Oooo000 oooo000 = new Oooo000();
            String str = (String) oO0000O.OooO0o0(bundle, C3037dc.f8261p, String.class, null);
            o000000O.OooO0oo(str);
            oooo000.f29626OooO00o = str;
            String str2 = (String) oO0000O.OooO0o0(bundle, "name", String.class, null);
            o000000O.OooO0oo(str2);
            oooo000.f29627OooO0O0 = str2;
            oooo000.f29628OooO0OO = oO0000O.OooO0o0(bundle, "value", Object.class, null);
            oooo000.f29629OooO0Oo = (String) oO0000O.OooO0o0(bundle, "trigger_event_name", String.class, null);
            oooo000.f29631OooO0o0 = ((Long) oO0000O.OooO0o0(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            oooo000.f29630OooO0o = (String) oO0000O.OooO0o0(bundle, "timed_out_event_name", String.class, null);
            oooo000.f29632OooO0oO = (Bundle) oO0000O.OooO0o0(bundle, "timed_out_event_params", Bundle.class, null);
            oooo000.f29633OooO0oo = (String) oO0000O.OooO0o0(bundle, "triggered_event_name", String.class, null);
            oooo000.f29625OooO = (Bundle) oO0000O.OooO0o0(bundle, "triggered_event_params", Bundle.class, null);
            oooo000.f29634OooOO0 = ((Long) oO0000O.OooO0o0(bundle, "time_to_live", Long.class, 0L)).longValue();
            oooo000.f29635OooOO0O = (String) oO0000O.OooO0o0(bundle, "expired_event_name", String.class, null);
            oooo000.OooOO0o = (Bundle) oO0000O.OooO0o0(bundle, "expired_event_params", Bundle.class, null);
            oooo000.f29636OooOOO = ((Boolean) oO0000O.OooO0o0(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            oooo000.f29637OooOOO0 = ((Long) oO0000O.OooO0o0(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            oooo000.f29638OooOOOO = ((Long) oO0000O.OooO0o0(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(oooo000);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0283 A[EDGE_INSN: B:431:0x0283->B:313:0x0283 BREAK  A[LOOP:9: B:332:0x02c8->B:432:?]] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(java.util.ArrayList r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000o0O.OooOO0.OooO0OO(java.util.ArrayList):void");
    }
}
