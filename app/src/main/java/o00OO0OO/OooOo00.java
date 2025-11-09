package o00OO0oo;

import java.util.LinkedHashMap;
import java.util.Map;
import o00O0.o0O0O00;
import o00OO0OO.OooO00o;

/* loaded from: classes3.dex */
public final class OooOo00 implements OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f32067OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO f32068OooO0O0;

    public OooOo00(OooO00o oooO00o) {
        o00Ooo o00ooo2 = o00Ooo.f32079OooO00o;
        this.f32067OooO00o = oooO00o;
        this.f32068OooO0O0 = new OooOOOO(o00Ooo.f32080OooO0O0, oooO00o.OooO0Oo());
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        map.size();
        OooOOOO descriptor = this.f32068OooO0O0;
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        o00OO.OooOo00 oooOo00OooO00o = oooOo00.OooO00o(descriptor);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(map2, "<this>");
        int i = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            oooOo00OooO00o.OooO0oo(descriptor, i, o00Ooo.f32079OooO00o, key);
            i += 2;
            oooOo00OooO00o.OooO0oo(descriptor, i2, this.f32067OooO00o, value);
        }
        oooOo00OooO00o.OooOO0o(descriptor);
    }

    @Override // o00OO0OO.OooO00o
    public Object OooO0OO(com.google.android.material.datepicker.OooO0o oooO0o) throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.OooOo.OooO0o0(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        com.google.android.material.datepicker.OooO0o oooO0oOooO00o = oooO0o.OooO00o(OooO0Oo());
        while (true) {
            int iOooO0OO = oooO0oOooO00o.OooO0OO(OooO0Oo());
            if (iOooO0OO == -1) {
                oooO0oOooO00o.OooOOO(OooO0Oo());
                kotlin.jvm.internal.OooOo.OooO0o0(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i = iOooO0OO + size;
            LinkedHashMap builder = linkedHashMap;
            kotlin.jvm.internal.OooOo.OooO0o0(builder, "builder");
            o00Ooo o00ooo2 = o00Ooo.f32079OooO00o;
            OooOOOO oooOOOO = this.f32068OooO0O0;
            Object objOooOO0 = oooO0oOooO00o.OooOO0(oooOOOO, i, o00ooo2, null);
            int iOooO0OO2 = oooO0oOooO00o.OooO0OO(oooOOOO);
            if (iOooO0OO2 != i + 1) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(i, iOooO0OO2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean zContainsKey = builder.containsKey(objOooOO0);
            OooO00o oooO00o = this.f32067OooO00o;
            builder.put(objOooOO0, (!zContainsKey || (oooO00o.OooO0Oo().getKind() instanceof o00OO0o.OooO0o)) ? oooO0oOooO00o.OooOO0(oooOOOO, iOooO0OO2, oooO00o, null) : oooO0oOooO00o.OooOO0(oooOOOO, iOooO0OO2, oooO00o, o0O0O00.OooOOO(objOooOO0, builder)));
        }
    }

    @Override // o00OO0OO.OooO00o
    public final o00OO0o.OooO OooO0Oo() {
        return this.f32068OooO0O0;
    }
}
