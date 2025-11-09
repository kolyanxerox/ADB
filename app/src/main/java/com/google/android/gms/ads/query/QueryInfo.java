package com.google.android.gms.ads.query;

import Oooo00O.o000000O;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1386ai;

/* loaded from: classes2.dex */
public class QueryInfo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzfa f16659OooO00o;

    public QueryInfo(zzfa zzfaVar) {
        this.f16659OooO00o = zzfaVar;
    }

    public static void OooO00o(final Context context, final AdFormat adFormat, final AdRequest adRequest, final String str, final QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Context context2;
        String str2;
        QueryInfoGenerationCallback queryInfoGenerationCallback2;
        AdFormat adFormat2;
        AdRequest adRequest2;
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18810OooOO0.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.query.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdRequest adRequest3 = adRequest;
                        zzei zzeiVarZza = adRequest3 == null ? null : adRequest3.zza();
                        new C1386ai(context, adFormat, zzeiVarZza, str, 0).OooOOoo(queryInfoGenerationCallback);
                    }
                });
                return;
            }
            context2 = context;
            adFormat2 = adFormat;
            adRequest2 = adRequest;
            str2 = str;
            queryInfoGenerationCallback2 = queryInfoGenerationCallback;
        } else {
            context2 = context;
            str2 = str;
            queryInfoGenerationCallback2 = queryInfoGenerationCallback;
            adFormat2 = adFormat;
            adRequest2 = adRequest;
        }
        new C1386ai(context2, adFormat2, adRequest2 == null ? null : adRequest2.zza(), str2, 0).OooOOoo(queryInfoGenerationCallback2);
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        OooO00o(context, adFormat, adRequest, null, queryInfoGenerationCallback);
    }

    @NonNull
    public String getQuery() {
        return this.f16659OooO00o.zzb();
    }

    @NonNull
    public Bundle getQueryBundle() {
        return this.f16659OooO00o.zza();
    }

    @NonNull
    public String getRequestId() {
        return this.f16659OooO00o.zzc();
    }

    public static void generate(@NonNull Context context, @NonNull AdFormat adFormat, @Nullable AdRequest adRequest, @NonNull String str, @NonNull QueryInfoGenerationCallback queryInfoGenerationCallback) {
        o000000O.OooO(str, "AdUnitId cannot be null.");
        OooO00o(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
