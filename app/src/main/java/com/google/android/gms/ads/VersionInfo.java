package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes2.dex */
public class VersionInfo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f15919OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f15920OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f15921OooO0OO;

    public VersionInfo(int i, int i2, int i3) {
        this.f15919OooO00o = i;
        this.f15920OooO0O0 = i2;
        this.f15921OooO0OO = i3;
    }

    public int getMajorVersion() {
        return this.f15919OooO00o;
    }

    public int getMicroVersion() {
        return this.f15921OooO0OO;
    }

    public int getMinorVersion() {
        return this.f15920OooO0O0;
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        return this.f15919OooO00o + "." + this.f15920OooO0O0 + "." + this.f15921OooO0OO;
    }
}
