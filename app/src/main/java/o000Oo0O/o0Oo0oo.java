package o000oo0O;

import Oooo0o0.OooO;
import com.google.android.gms.internal.ads.C1386ai;
import com.ironsource.C3912zo;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0Oo0oo extends OooO {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C1386ai f31108OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Map f31109OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f31110OooOoOO;

    public o0Oo0oo(Map map, boolean z) {
        super(6);
        this.f31108OooOoO = new C1386ai(24, false);
        this.f31109OooOoO0 = map;
        this.f31110OooOoOO = z;
    }

    @Override // Oooo0o0.OooO
    public final Object OooOO0(String str) {
        return this.f31109OooOoO0.get(str);
    }

    @Override // Oooo0o0.OooO
    public final String OooOO0O() {
        return (String) this.f31109OooOoO0.get("method");
    }

    @Override // Oooo0o0.OooO
    public final boolean OooOO0o() {
        return this.f31110OooOoOO;
    }

    @Override // Oooo0o0.OooO
    public final boolean OooOOO() {
        return this.f31109OooOoO0.containsKey("transactionId");
    }

    @Override // Oooo0o0.OooO
    public final o0O0O00 OooOOO0() {
        return this.f31108OooOoO;
    }

    public final void OooOoO(ArrayList arrayList) {
        if (this.f31110OooOoOO) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", (Serializable) this.f31108OooOoO.f17044OooOo0o);
        arrayList.add(map);
    }

    public final void OooOoO0(ArrayList arrayList) {
        if (this.f31110OooOoOO) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C1386ai c1386ai = this.f31108OooOoO;
        map2.put("code", (String) c1386ai.f17045OooOoO);
        map2.put(Constants.MESSAGE, (String) c1386ai.f17042OooOo);
        map2.put("data", (HashMap) c1386ai.f17046OooOoO0);
        map.put(C3912zo.a.f13038g, map2);
        arrayList.add(map);
    }
}
