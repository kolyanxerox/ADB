package com.google.android.gms.internal.ads;

import android.graphics.Color;
import io.flutter.embedding.android.KeyboardMap;

/* loaded from: classes2.dex */
public final class ooOOOOoo {

    /* renamed from: OooO, reason: collision with root package name */
    public final boolean f23058OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f23059OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23060OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f23061OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f23062OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f23063OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f23064OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f23065OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f23066OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final int f23067OooOO0;

    public ooOOOOoo(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f23059OooO00o = str;
        this.f23060OooO0O0 = i;
        this.f23061OooO0OO = num;
        this.f23062OooO0Oo = num2;
        this.f23064OooO0o0 = f;
        this.f23063OooO0o = z;
        this.f23065OooO0oO = z2;
        this.f23066OooO0oo = z3;
        this.f23058OooO = z4;
        this.f23067OooOO0 = i2;
    }

    public static Integer OooO00o(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            af0.OoooO0(j <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(ii0.OooOo0O(((j >> 24) & 255) ^ 255), ii0.OooOo0O(j & 255), ii0.OooOo0O((j >> 8) & 255), ii0.OooOo0O((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC1641hg.OooOOoo("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static boolean OooO0O0(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC1641hg.OooOOoo("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
