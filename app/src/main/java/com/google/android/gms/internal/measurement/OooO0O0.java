package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000Ooo.o0O00o0 f26415OooO0Oo = o0000Ooo.o0O00o0.OooOO0o(3, "_syn", "_err", "_el");

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f26416OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f26417OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f26418OooO0OO;

    public OooO0O0(String str, long j, HashMap map) {
        this.f26416OooO00o = str;
        this.f26417OooO0O0 = j;
        HashMap map2 = new HashMap();
        this.f26418OooO0OO = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object OooO0O0(Object obj, String str, Object obj2) {
        if (f26415OooO0Oo.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final OooO0O0 clone() {
        return new OooO0O0(this.f26416OooO00o, this.f26417OooO0O0, new HashMap(this.f26418OooO0OO));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        if (this.f26417OooO0O0 == oooO0O0.f26417OooO0O0 && this.f26416OooO00o.equals(oooO0O0.f26416OooO00o)) {
            return this.f26418OooO0OO.equals(oooO0O0.f26418OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f26416OooO00o.hashCode() * 31;
        HashMap map = this.f26418OooO0OO;
        long j = this.f26417OooO0O0;
        return map.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f26416OooO00o;
        String string = this.f26418OooO0OO.toString();
        int length = String.valueOf(str).length();
        long j = this.f26417OooO0O0;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
