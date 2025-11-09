package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class z90 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26130OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2163vl f26131OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Context f26132OooO0OO;

    public /* synthetic */ z90(Context context, C2163vl c2163vl, int i) {
        this.f26130OooO00o = i;
        this.f26132OooO0OO = context;
        this.f26131OooO0O0 = c2163vl;
    }

    public Intent OooO00o() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOoO)).booleanValue();
        Context context = this.f26132OooO0OO;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        switch (this.f26130OooO00o) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            case 7:
                return 38;
            default:
                return 39;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        switch (this.f26130OooO00o) {
            case 0:
                boolean z = false;
                Object obj = null;
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OoO0)).booleanValue()) {
                    return ii0.OooooOO(new aa0(obj, z, 0));
                }
                ContentResolver contentResolver = this.f26132OooO0OO.getContentResolver();
                if (contentResolver == null) {
                    return ii0.OooooOO(new aa0(obj, z, 0));
                }
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(contentResolver, 10));
            case 1:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 13));
            case 2:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 14));
            case 3:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 16));
            case 4:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 17));
            case 5:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 26));
            case 6:
                if (!((Boolean) AbstractC1413b8.f17433OooO0O0.OooOOO()).booleanValue()) {
                    return ii0.OooooOO(new nb0(-1, -1));
                }
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 27));
            case 7:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 28));
            default:
                return this.f26131OooO0O0.OooO0O0(new CallableC1736k1(this, 29));
        }
    }

    public /* synthetic */ z90(C2163vl c2163vl, Context context, int i) {
        this.f26130OooO00o = i;
        this.f26131OooO0O0 = c2163vl;
        this.f26132OooO0OO = context;
    }
}
