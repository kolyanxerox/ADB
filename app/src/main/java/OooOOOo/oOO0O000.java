package OoooOOO;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.oOO0Oo00;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oOO0O000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14838OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f14839OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.o0O0OOO0 f14840OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final BitSet f14841OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayMap f14842OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final BitSet f14843OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayMap f14844OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f14845OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oOO0O000(o00O0O0 o00o0o0, String str, com.google.android.gms.internal.measurement.o0O0OOO0 o0o0ooo0, BitSet bitSet, BitSet bitSet2, ArrayMap arrayMap, ArrayMap arrayMap2) {
        Objects.requireNonNull(o00o0o0);
        this.f14845OooO0oo = o00o0o0;
        this.f14838OooO00o = str;
        this.f14841OooO0Oo = bitSet;
        this.f14843OooO0o0 = bitSet2;
        this.f14842OooO0o = arrayMap;
        this.f14844OooO0oO = new ArrayMap();
        for (K k : arrayMap2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) arrayMap2.get(k));
            this.f14844OooO0oO.put(k, arrayList);
        }
        this.f14839OooO0O0 = false;
        this.f14840OooO0OO = o0o0ooo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(o00O0O00 o00o0o00) {
        int iOooOOo0;
        boolean z;
        boolean zOooOo0O;
        switch (o00o0o00.f14118OooO0oO) {
            case 0:
                iOooOOo0 = ((com.google.android.gms.internal.measurement.o00O0O00) o00o0o00.f14111OooO).OooOOo0();
                break;
            default:
                iOooOOo0 = ((com.google.android.gms.internal.measurement.oo0oOO0) o00o0o00.f14111OooO).OooOOo0();
                break;
        }
        if (o00o0o00.f14114OooO0OO != null) {
            this.f14843OooO0o0.set(iOooOOo0, true);
        }
        Boolean bool = o00o0o00.f14115OooO0Oo;
        if (bool != null) {
            this.f14841OooO0Oo.set(iOooOOo0, bool.booleanValue());
        }
        if (o00o0o00.f14117OooO0o0 != null) {
            Integer numValueOf = Integer.valueOf(iOooOOo0);
            ArrayMap arrayMap = this.f14842OooO0o;
            Long l = (Long) arrayMap.get(numValueOf);
            long jLongValue = o00o0o00.f14117OooO0o0.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                arrayMap.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (o00o0o00.f14116OooO0o != null) {
            ArrayMap arrayMap2 = this.f14844OooO0oO;
            Integer numValueOf2 = Integer.valueOf(iOooOOo0);
            List arrayList = (List) arrayMap2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                arrayMap2.put(numValueOf2, arrayList);
            }
            switch (o00o0o00.f14118OooO0oO) {
                case 0:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            oOO0Oo00.OooO00o();
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14845OooO0oo.f14574OooOo0O;
            o00O0OO o00o0oo = o0oo0oo0.f14519OooOoO0;
            o0O000 o0o000 = o0O000O.f14287o000000o;
            String str = this.f14838OooO00o;
            if (o00o0oo.OooOo0(str, o0o000)) {
                switch (o00o0o00.f14118OooO0oO) {
                    case 0:
                        zOooOo0O = ((com.google.android.gms.internal.measurement.o00O0O00) o00o0o00.f14111OooO).OooOo0O();
                        break;
                    default:
                        zOooOo0O = false;
                        break;
                }
                if (zOooOo0O) {
                    arrayList.clear();
                }
            }
            oOO0Oo00.OooO00o();
            if (!o0oo0oo0.f14519OooOoO0.OooOo0(str, o0o000)) {
                arrayList.add(Long.valueOf(o00o0o00.f14116OooO0o.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(o00o0o00.f14116OooO0o.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.o0O000O OooO0O0(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.o0O000 o0o000OooOo0o = com.google.android.gms.internal.measurement.o0O000O.OooOo0o();
        o0o000OooOo0o.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O000O) o0o000OooOo0o.f26683OooOo0o).OooOo(i);
        o0o000OooOo0o.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O000O) o0o000OooOo0o.f26683OooOo0o).OooOoOO(this.f14839OooO0O0);
        com.google.android.gms.internal.measurement.o0O0OOO0 o0o0ooo0 = this.f14840OooO0OO;
        if (o0o0ooo0 != null) {
            o0o000OooOo0o.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0O000O) o0o000OooOo0o.f26683OooOo0o).OooOoO(o0o0ooo0);
        }
        com.google.android.gms.internal.measurement.o0O0OO0 o0o0oo0OooOo = com.google.android.gms.internal.measurement.o0O0OOO0.OooOo();
        ArrayList arrayListOoooO0O = oo0OOoo.OoooO0O(this.f14841OooO0Oo);
        o0o0oo0OooOo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O0OOO0) o0o0oo0OooOo.f26683OooOo0o).OooOoo0(arrayListOoooO0O);
        ArrayList arrayListOoooO0O2 = oo0OOoo.OoooO0O(this.f14843OooO0o0);
        o0o0oo0OooOo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O0OOO0) o0o0oo0OooOo.f26683OooOo0o).OooOoO(arrayListOoooO0O2);
        ArrayMap arrayMap = this.f14842OooO0o;
        if (arrayMap == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayMap.size());
            for (Integer num : arrayMap.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) arrayMap.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.o0OoO00O o0ooo00oOooOo00 = com.google.android.gms.internal.measurement.o0O00O0o.OooOo00();
                    o0ooo00oOooOo00.OooO0O0();
                    ((com.google.android.gms.internal.measurement.o0O00O0o) o0ooo00oOooOo00.f26683OooOo0o).OooOo0(iIntValue);
                    long jLongValue = l.longValue();
                    o0ooo00oOooOo00.OooO0O0();
                    ((com.google.android.gms.internal.measurement.o0O00O0o) o0ooo00oOooOo00.f26683OooOo0o).OooOo0O(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.o0O00O0o) o0ooo00oOooOo00.OooO0o0());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            o0o0oo0OooOo.OooO0O0();
            ((com.google.android.gms.internal.measurement.o0O0OOO0) o0o0oo0OooOo.f26683OooOo0o).OooOooO(arrayList);
        }
        ArrayMap arrayMap2 = this.f14844OooO0oO;
        if (arrayMap2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayMap2.size());
            for (Integer num2 : arrayMap2.keySet()) {
                com.google.android.gms.internal.measurement.o0O0OOOo o0o0ooooOooOo0 = com.google.android.gms.internal.measurement.oo0OOoo.OooOo0();
                int iIntValue2 = num2.intValue();
                o0o0ooooOooOo0.OooO0O0();
                ((com.google.android.gms.internal.measurement.oo0OOoo) o0o0ooooOooOo0.f26683OooOo0o).OooOo0O(iIntValue2);
                List list2 = (List) arrayMap2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    o0o0ooooOooOo0.OooO0O0();
                    ((com.google.android.gms.internal.measurement.oo0OOoo) o0o0ooooOooOo0.f26683OooOo0o).OooOo0o(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.oo0OOoo) o0o0ooooOooOo0.OooO0o0());
            }
            list = arrayList3;
        }
        o0o0oo0OooOo.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O0OOO0) o0o0oo0OooOo.f26683OooOo0o).Oooo000(list);
        o0o000OooOo0o.OooO0O0();
        ((com.google.android.gms.internal.measurement.o0O000O) o0o000OooOo0o.f26683OooOo0o).OooOoO0((com.google.android.gms.internal.measurement.o0O0OOO0) o0o0oo0OooOo.OooO0o0());
        return (com.google.android.gms.internal.measurement.o0O000O) o0o000OooOo0o.OooO0o0();
    }

    public /* synthetic */ oOO0O000(o00O0O0 o00o0o0, String str) {
        Objects.requireNonNull(o00o0o0);
        this.f14845OooO0oo = o00o0o0;
        this.f14838OooO00o = str;
        this.f14839OooO0O0 = true;
        this.f14841OooO0Oo = new BitSet();
        this.f14843OooO0o0 = new BitSet();
        this.f14842OooO0o = new ArrayMap();
        this.f14844OooO0oO = new ArrayMap();
    }
}
