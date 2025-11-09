package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* renamed from: com.google.android.gms.internal.ads.zh */
/* loaded from: classes2.dex */
public final class BinderC2307zh extends AbstractBinderC2181w2 implements InterfaceC1389al {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ QueryInfoGenerationCallback f26168OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2307zh(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f26168OooOo0O = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1389al
    public final void o000000o(String str, Bundle bundle, String str2) {
        this.f26168OooOo0O.onSuccess(new QueryInfo(new zzfa(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zzb(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            o000000o(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1389al
    public final void zzb(String str) {
        this.f26168OooOo0O.onFailure(str);
    }
}
