package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class o0OOO0OO extends OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f26565OooOo = 0;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Object f26566OooOoO0;

    public o0OOO0OO(Oooo.OooOo00 oooOo00) {
        super("internal.eventLogger");
        this.f26566OooOoO0 = oooOo00;
    }

    @Override // com.google.android.gms.internal.measurement.OooOOO0
    public final Oooo0 OooO00o(C2051sk c2051sk, List list) {
        TreeMap treeMap;
        switch (this.f26565OooOo) {
            case 0:
                o00O0.o000OOo.OooOOO0(this.f26427OooOo0O, list, 3);
                String strZzc = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) list.get(0)).zzc();
                Oooo0 oooo0 = (Oooo0) list.get(1);
                oo000o oo000oVar = (oo000o) c2051sk.f24096OooOo;
                long jOooOo0 = (long) o00O0.o000OOo.OooOo0(oo000oVar.OooO0OO(c2051sk, oooo0).zzd().doubleValue());
                Oooo0 oooo0OooO0OO = oo000oVar.OooO0OO(c2051sk, (Oooo0) list.get(2));
                HashMap mapOooOo0o = oooo0OooO0OO instanceof OooOo00 ? o00O0.o000OOo.OooOo0o((OooOo00) oooo0OooO0OO) : new HashMap();
                Oooo.OooOo00 oooOo00 = (Oooo.OooOo00) this.f26566OooOoO0;
                oooOo00.getClass();
                HashMap map = new HashMap();
                for (String str : mapOooOo0o.keySet()) {
                    HashMap map2 = ((OooO0O0) oooOo00.f13712OooOo0o).f26418OooO0OO;
                    map.put(str, OooO0O0.OooO0O0(map2.containsKey(str) ? map2.get(str) : null, str, mapOooOo0o.get(str)));
                }
                ((ArrayList) oooOo00.f13713OooOoO0).add(new OooO0O0(strZzc, jOooOo0, map));
                return Oooo0.OooOO0o;
            case 1:
                o00O0.o000OOo.OooOOO0("getValue", list, 2);
                Oooo0 oooo0OooO0OO2 = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) list.get(0));
                Oooo0 oooo0OooO0OO3 = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) list.get(1));
                String strZzc2 = oooo0OooO0OO2.zzc();
                OooO0oO.OooOOO0 oooOOO0 = (OooO0oO.OooOOO0) this.f26566OooOoO0;
                Map map3 = (Map) ((OoooOOO.o0OO00o0) oooOOO0.f13278OooOo).f14488OooOoO0.get((String) oooOOO0.f13280OooOo0o);
                String str2 = (map3 == null || !map3.containsKey(strZzc2)) ? null : (String) map3.get(strZzc2);
                return str2 != null ? new o00O0O(str2) : oooo0OooO0OO3;
            case 2:
                return Oooo0.OooOO0o;
            case 3:
                try {
                    return o000O00.o00O0O0O.OooOooo(((OoooOOO.oo0ooO) this.f26566OooOoO0).call());
                } catch (Exception unused) {
                    return Oooo0.OooOO0o;
                }
            default:
                o00O0.o000OOo.OooOOO0(this.f26427OooOo0O, list, 3);
                ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) list.get(0)).zzc();
                Oooo0 oooo02 = (Oooo0) list.get(1);
                oo000o oo000oVar2 = (oo000o) c2051sk.f24096OooOo;
                Oooo0 oooo0OooO0OO4 = oo000oVar2.OooO0OO(c2051sk, oooo02);
                if (!(oooo0OooO0OO4 instanceof Oooo000)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                Oooo0 oooo0OooO0OO5 = oo000oVar2.OooO0OO(c2051sk, (Oooo0) list.get(2));
                if (!(oooo0OooO0OO5 instanceof OooOo00)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                OooOo00 oooOo002 = (OooOo00) oooo0OooO0OO5;
                if (!oooOo002.f26429OooOo0O.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzc3 = oooOo002.zzk("type").zzc();
                int iOooOo00 = oooOo002.f26429OooOo0O.containsKey("priority") ? o00O0.o000OOo.OooOo00(oooOo002.zzk("priority").zzd().doubleValue()) : 1000;
                Oooo000 oooo000 = (Oooo000) oooo0OooO0OO4;
                oo000o oo000oVar3 = (oo000o) this.f26566OooOoO0;
                oo000oVar3.getClass();
                if ("create".equals(strZzc3)) {
                    treeMap = (TreeMap) oo000oVar3.f26893OooO0O0;
                } else {
                    if (!"edit".equals(strZzc3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzc3)));
                    }
                    treeMap = (TreeMap) oo000oVar3.f26892OooO00o;
                }
                if (treeMap.containsKey(Integer.valueOf(iOooOo00))) {
                    iOooOo00 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iOooOo00), oooo000);
                return Oooo0.OooOO0o;
        }
    }

    public o0OOO0OO(OoooOOO.oo0ooO oo0ooo) {
        super("internal.appMetadata");
        this.f26566OooOoO0 = oo0ooo;
    }

    public o0OOO0OO(oo000o oo000oVar) {
        super("internal.registerCallback");
        this.f26566OooOoO0 = oo000oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(oO00OOo0 oo00ooo0, OooO0oO.OooOOO0 oooOOO0) {
        super("getValue");
        this.f26566OooOoO0 = oooOOO0;
    }

    public o0OOO0OO(o000Ooo0.OooOO0 oooOO0) {
        super("internal.logger");
        this.f26566OooOoO0 = oooOO0;
        this.f26428OooOo0o.put("log", new C2335e0(this, false, true));
        this.f26428OooOo0o.put(NotificationCompat.GROUP_KEY_SILENT, new oO00OOo0(NotificationCompat.GROUP_KEY_SILENT, 1));
        ((OooOOO0) this.f26428OooOo0o.get(NotificationCompat.GROUP_KEY_SILENT)).OooO0o0("log", new C2335e0(this, true, true));
        this.f26428OooOo0o.put("unmonitored", new oO00OOo0("unmonitored", 2));
        ((OooOOO0) this.f26428OooOo0o.get("unmonitored")).OooO0o0("log", new C2335e0(this, false, false));
    }
}
