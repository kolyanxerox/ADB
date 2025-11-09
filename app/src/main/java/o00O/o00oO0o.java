package o00O;

import o00O0oOo.o00OOO0O;

/* loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31218OooOo0O;

    public /* synthetic */ o00oO0o(int i) {
        this.f31218OooOo0O = i;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        o00O0O0O.OooO0O0 oooO0O0;
        switch (this.f31218OooOo0O) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                String acc = (String) obj;
                o00O0O0O.OooOO0 element = (o00O0O0O.OooOO0) obj2;
                kotlin.jvm.internal.OooOo.OooO0o0(acc, "acc");
                kotlin.jvm.internal.OooOo.OooO0o0(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 2:
                o00O0O0O.OooOOO0 acc2 = (o00O0O0O.OooOOO0) obj;
                o00O0O0O.OooOO0 element2 = (o00O0O0O.OooOO0) obj2;
                kotlin.jvm.internal.OooOo.OooO0o0(acc2, "acc");
                kotlin.jvm.internal.OooOo.OooO0o0(element2, "element");
                o00O0O0O.OooOOO0 oooOOO0MinusKey = acc2.minusKey(element2.getKey());
                o00O0O0O.OooOOO oooOOO = o00O0O0O.OooOOO.f31358OooOo0O;
                if (oooOOO0MinusKey == oooOOO) {
                    return element2;
                }
                o00O0O0O.OooO0o oooO0o = o00O0O0O.OooO0o.f31357OooOo0O;
                o00O0O0O.OooO oooO = (o00O0O0O.OooO) oooOOO0MinusKey.get(oooO0o);
                if (oooO == null) {
                    oooO0O0 = new o00O0O0O.OooO0O0(element2, oooOOO0MinusKey);
                } else {
                    o00O0O0O.OooOOO0 oooOOO0MinusKey2 = oooOOO0MinusKey.minusKey(oooO0o);
                    if (oooOOO0MinusKey2 == oooOOO) {
                        return new o00O0O0O.OooO0O0(oooO, element2);
                    }
                    oooO0O0 = new o00O0O0O.OooO0O0(oooO, new o00O0O0O.OooO0O0(element2, oooOOO0MinusKey2));
                }
                return oooO0O0;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                return ((o00O0O0O.OooOOO0) obj).plus((o00O0O0O.OooOO0) obj2);
            case 5:
                return ((o00O0O0O.OooOOO0) obj).plus((o00O0O0O.OooOO0) obj2);
            case 6:
                o00O0O0O.OooOO0 oooOO0 = (o00O0O0O.OooOO0) obj2;
                if (!(oooOO0 instanceof o00OOO0O)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? oooOO0 : Integer.valueOf(iIntValue + 1);
            case 7:
                o00OOO0O o00ooo0o = (o00OOO0O) obj;
                o00O0O0O.OooOO0 oooOO02 = (o00O0O0O.OooOO0) obj2;
                if (o00ooo0o != null) {
                    return o00ooo0o;
                }
                if (oooOO02 instanceof o00OOO0O) {
                    return (o00OOO0O) oooOO02;
                }
                return null;
            default:
                return (o00OO000.o0OOO0o) obj;
        }
    }
}
