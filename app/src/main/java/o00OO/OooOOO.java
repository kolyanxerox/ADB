package o00OO;

import OoooOOO.C0001o0;

/* loaded from: classes3.dex */
public abstract class OooOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOOO f31863OooO00o = new OooOOOO();

    public static final o00OO0o.OooO OooO00o(o00OO0o.OooO oooO, C0001o0 module) {
        kotlin.jvm.internal.OooOo.OooO0o0(oooO, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(module, "module");
        if (!kotlin.jvm.internal.OooOo.OooO00o(oooO.getKind(), o00OO0o.OooOO0.f32047OooOoO0)) {
            return oooO.isInline() ? OooO00o(oooO.OooO0oO(0), module) : oooO;
        }
        OooO00o.OooO00o.OooOO0(oooO);
        return oooO;
    }

    public static final byte OooO0O0(char c) {
        if (c < '~') {
            return OooO0OO.f31860OooO0O0[c];
        }
        return (byte) 0;
    }

    public static final void OooO0OO(oo0O.OooO0O0 json, OooO0oO.Oooo0 oooo0, o00OO0OO.OooO00o serializer, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
        kotlin.jvm.internal.OooOo.OooO0o0(serializer, "serializer");
        Oooo0 oooo02 = Oooo0.f31880OooOo;
        OooOo00[] oooOo00Arr = new OooOo00[Oooo0.f31884OooOoo.size()];
        json.f33202OooO00o.getClass();
        new OooOo00(new OooO0oO.Oooo000(oooo0), json, oooo02, oooOo00Arr).OooO(serializer, obj);
    }

    public static final void OooO0Oo(OooOo oooOo, String str) {
        oooOo.OooOO0(oooOo.f31867OooO00o - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void OooO0o(o00OO0o.OooO oooO, oo0O.OooO0O0 json) {
        kotlin.jvm.internal.OooOo.OooO0o0(oooO, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
        if (kotlin.jvm.internal.OooOo.OooO00o(oooO.getKind(), o00OO0o.OooOO0O.f32049OooOoO0)) {
            json.f33202OooO00o.getClass();
        }
    }

    public static final CharSequence OooO0o0(CharSequence charSequence, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbOooOo0O.append(charSequence.subSequence(i2, i3).toString());
                sbOooOo0O.append(str2);
                return sbOooOo0O.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final Oooo0 OooO0oO(o00OO0o.OooO desc, oo0O.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOo.OooO0o0(oooO0O0, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(desc, "desc");
        Oooo0o0.OooO kind = desc.getKind();
        if (kind instanceof o00OO0o.OooO0O0) {
            return Oooo0.f31883OooOoOO;
        }
        if (kotlin.jvm.internal.OooOo.OooO00o(kind, o00OO0o.OooOO0O.f32048OooOoO)) {
            return Oooo0.f31882OooOoO0;
        }
        if (!kotlin.jvm.internal.OooOo.OooO00o(kind, o00OO0o.OooOO0O.f32050OooOoOO)) {
            return Oooo0.f31880OooOo;
        }
        o00OO0o.OooO oooOOooO00o = OooO00o(desc.OooO0oO(0), oooO0O0.f33203OooO0O0);
        Oooo0o0.OooO kind2 = oooOOooO00o.getKind();
        if ((kind2 instanceof o00OO0o.OooO0o) || kotlin.jvm.internal.OooOo.OooO00o(kind2, o00OO0o.OooOO0.f32046OooOoO)) {
            return Oooo0.f31881OooOoO;
        }
        oooO0O0.f33202OooO00o.getClass();
        throw new OooO0o("Value of type '" + oooOOooO00o.OooO0oo() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + oooOOooO00o.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
