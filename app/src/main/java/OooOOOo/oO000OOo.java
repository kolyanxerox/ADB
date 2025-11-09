package OoooOOO;

import Oooo00O.o000000O;
import android.os.Bundle;
import com.ironsource.C3037dc;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class oO000OOo implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ oO0O0OoO f14636OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14637OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Bundle f14638OooOo0o;

    public oO000OOo(oO0O0OoO oo0o0ooo, Bundle bundle, int i) {
        this.f14637OooOo0O = i;
        switch (i) {
            case 1:
                this.f14638OooOo0o = bundle;
                Objects.requireNonNull(oo0o0ooo);
                this.f14636OooOo = oo0o0ooo;
                break;
            case 2:
                this.f14636OooOo = oo0o0ooo;
                this.f14638OooOo0o = bundle;
                break;
            default:
                this.f14638OooOo0o = bundle;
                Objects.requireNonNull(oo0o0ooo);
                this.f14636OooOo = oo0o0ooo;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f14637OooOo0O) {
            case 0:
                oO0O0OoO oo0o0ooo = this.f14636OooOo;
                oo0o0ooo.OooOO0O();
                oo0o0ooo.OooOO0o();
                Bundle bundle2 = this.f14638OooOo0o;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString(C3037dc.f8261p);
                o000000O.OooO0o0(string);
                o000000O.OooO0o0(string2);
                o000000O.OooO0oo(bundle2.get("value"));
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0ooo.f14574OooOo0O;
                if (!o0oo0oo0.OooO0o()) {
                    o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o0);
                    o0o0o0o0.f14398Oooo0.OooO0O0("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    oOO000o ooo000o = new oOO000o(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo);
                        bundle2.getString("app_id");
                        o00OOOOo o00oooooOooo0o0 = ooo00oo.Oooo0o0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        o0OO0oO0.OooOO0O(ooo00oo);
                        bundle2.getString("app_id");
                        o00OOOOo o00oooooOooo0o02 = ooo00oo.Oooo0o0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        o0oo0oo0.OooOOOo().OooOooO(new o00O0OO0(bundle2.getString("app_id"), string2, ooo000o, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), o00oooooOooo0o02, bundle2.getLong("trigger_timeout"), o00oooooOooo0o0, bundle2.getLong("time_to_live"), ooo00oo.Oooo0o0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                oO0O0OoO oo0o0ooo2 = this.f14636OooOo;
                oo0o0ooo2.OooOO0O();
                oo0o0ooo2.OooOO0o();
                Bundle bundle3 = this.f14638OooOo0o;
                String string3 = bundle3.getString("name");
                o000000O.OooO0o0(string3);
                o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0o0ooo2.f14574OooOo0O;
                if (!o0oo0oo02.OooO0o()) {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo02.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14398Oooo0.OooO0O0("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    oOO000o ooo000o2 = new oOO000o(0L, null, string3, "");
                    try {
                        oOO00OO ooo00oo2 = o0oo0oo02.f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo2);
                        bundle3.getString("app_id");
                        o0oo0oo02.OooOOOo().OooOooO(new o00O0OO0(bundle3.getString("app_id"), "", ooo000o2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), ooo00oo2.Oooo0o0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                oO0O0OoO oo0o0ooo3 = this.f14636OooOo;
                oo0o0ooo3.getClass();
                Bundle bundle4 = this.f14638OooOo0o;
                boolean zIsEmpty = bundle4.isEmpty();
                o0OO0oO0 o0oo0oo03 = (o0OO0oO0) oo0o0ooo3.f14574OooOo0O;
                if (zIsEmpty) {
                    bundle = bundle4;
                } else {
                    o0O o0o = o0oo0oo03.f14518OooOoO;
                    o0OO0oO0.OooOO0O(o0o);
                    bundle = new Bundle(o0o.f14202OoooO.OooO0o0());
                    Iterator<String> it = bundle4.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        OooOO0 oooOO0 = oo0o0ooo3.f14744OoooO0;
                        o00O0OO o00o0oo = o0oo0oo03.f14519OooOoO0;
                        o0O0O0o0 o0o0o0o03 = o0oo0oo03.f14520OooOoOO;
                        oOO00OO ooo00oo3 = o0oo0oo03.f14523OooOooO;
                        if (zHasNext) {
                            String next = it.next();
                            Object obj = bundle4.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                o0OO0oO0.OooOO0O(ooo00oo3);
                                if (oOO00OO.oo000o(obj)) {
                                    oOO00OO.OooOoOO(oooOO0, null, 27, null, null, 0);
                                }
                                o0OO0oO0.OooOOO0(o0o0o0o03);
                                o0o0o0o03.f14399Oooo000.OooO0Oo(next, "Invalid default event parameter type. Name, value", obj);
                            } else if (oOO00OO.Oooo00o(next)) {
                                o0OO0oO0.OooOOO0(o0o0o0o03);
                                o0o0o0o03.f14399Oooo000.OooO0OO(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle.remove(next);
                            } else {
                                o0OO0oO0.OooOO0O(ooo00oo3);
                                o00o0oo.getClass();
                                if (ooo00oo3.o00oO0o("param", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, next, obj)) {
                                    ooo00oo3.OooOoO(next, obj, bundle);
                                }
                            }
                        } else {
                            o0OO0oO0.OooOO0O(ooo00oo3);
                            oOO00OO ooo00oo4 = ((o0OO0oO0) o00o0oo.f14574OooOo0O).f14523OooOooO;
                            o0OO0oO0.OooOO0O(ooo00oo4);
                            int i = ooo00oo4.Oooo0oo(201500000) ? 100 : 25;
                            if (bundle.size() > i) {
                                Iterator it2 = new TreeSet(bundle.keySet()).iterator();
                                int i2 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i2++;
                                    if (i2 > i) {
                                        bundle.remove(str);
                                    }
                                }
                                o0OO0oO0.OooOO0O(ooo00oo3);
                                oOO00OO.OooOoOO(oooOO0, null, 26, null, null, 0);
                                o0OO0oO0.OooOOO0(o0o0o0o03);
                                o0o0o0o03.f14399Oooo000.OooO0O0("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                o0O o0o2 = o0oo0oo03.f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o2);
                o0o2.f14202OoooO.OooOOO(bundle);
                if (bundle4.isEmpty()) {
                    if (!o0oo0oo03.f14519OooOoO0.OooOo0(null, o0O000O.f14295o0000O)) {
                    }
                }
                o0oo0oo03.OooOOOo().OooOOOo(bundle);
                break;
        }
    }
}
