package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o0O0OO0 extends LinkedHashMap {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o0O0OO0 f27110OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f27111OooOo0O = true;

    static {
        o0O0OO0 o0o0oo0 = new o0O0OO0();
        f27110OooOo0o = o0o0oo0;
        o0o0oo0.f27111OooOo0O = false;
    }

    public static int OooO00o(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof o0oo0000) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = o0oO0Ooo.f27160OooO00o;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void OooO0O0() {
        if (!this.f27111OooOo0O) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iOooO00o = 0;
        for (Map.Entry entry : entrySet()) {
            iOooO00o += OooO00o(entry.getValue()) ^ OooO00o(entry.getKey());
        }
        return iOooO00o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0O0();
        Charset charset = o0oO0Ooo.f27160OooO00o;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        OooO0O0();
        for (Object obj : map.keySet()) {
            Charset charset = o0oO0Ooo.f27160OooO00o;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0O0();
        return super.remove(obj);
    }
}
