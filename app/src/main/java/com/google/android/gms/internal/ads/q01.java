package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class q01 extends LinkedHashMap {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final q01 f23473OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f23474OooOo0O = true;

    static {
        q01 q01Var = new q01();
        f23473OooOo0o = q01Var;
        q01Var.f23474OooOo0O = false;
    }

    public static int OooO0O0(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof b01) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = i01.f19888OooO00o;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final q01 OooO00o() {
        if (isEmpty()) {
            return new q01();
        }
        q01 q01Var = new q01(this);
        q01Var.f23474OooOo0O = true;
        return q01Var;
    }

    public final void OooO0OO() {
        if (!this.f23474OooOo0O) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0OO();
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
        int iOooO0O0 = 0;
        for (Map.Entry entry : entrySet()) {
            iOooO0O0 += OooO0O0(entry.getValue()) ^ OooO0O0(entry.getKey());
        }
        return iOooO0O0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0OO();
        Charset charset = i01.f19888OooO00o;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        OooO0OO();
        for (Object obj : map.keySet()) {
            Charset charset = i01.f19888OooO00o;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        OooO0OO();
        return super.remove(obj);
    }
}
