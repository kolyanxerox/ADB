package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class o00O0000 implements Comparable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f28240OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final java.lang.reflect.Field f28241OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final FieldType f28242OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f28243OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final java.lang.reflect.Field f28244OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f28245OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final java.lang.reflect.Field f28246OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f28247OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final Object f28248OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final Internal.EnumVerifier f28249OooOooo;

    public o00O0000(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f28241OooOo0O = field;
        this.f28242OooOo0o = fieldType;
        this.f28240OooOo = i;
        this.f28244OooOoO0 = field2;
        this.f28243OooOoO = i2;
        this.f28245OooOoOO = z;
        this.f28247OooOoo0 = z2;
        this.f28248OooOooO = obj;
        this.f28249OooOooo = enumVerifier;
        this.f28246OooOoo = field3;
    }

    public static void OooO00o(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(i, "fieldNumber must be positive: "));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f28240OooOo - ((o00O0000) obj).f28240OooOo;
    }
}
