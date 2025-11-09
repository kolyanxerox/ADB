package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.appset.AppSetIdInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.tq */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2094tq implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f24466OooO00o;

    public /* synthetic */ C2094tq(int i) {
        this.f24466OooO00o = i;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) throws IOException {
        z70 z70Var;
        switch (this.f24466OooO00o) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOoo00)).booleanValue()) {
                    zzv.zzp().OooO("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    zzv.zzp().OooO0oO("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                pm0 pm0Var = rm0.f23913OooOo0o;
                return ii0.OooooOO(new GetTopicsResponse(gn0.f19388OooOoO));
            case 1:
                zze.zzb("Error during loading assets.", (Exception) obj);
                return yp0.f25991OooOo0o;
            case 2:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return ii0.Ooooo00(cause);
            case 3:
                return ii0.Ooooo00(new a40(5));
            case 4:
                Exception exc = (Exception) obj;
                zzv.zzp().OooO0oO("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    z70Var = new z70(1, "Timed out waiting for ad response.");
                } else if (exc instanceof z70) {
                    z70Var = (z70) exc;
                } else {
                    z70Var = new z70(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                return ii0.Ooooo00(z70Var);
            case 5:
                return yp0.f25991OooOo0o;
            case 6:
                return ii0.OooooOO(((w40) obj).f25181OooO00o);
            case 7:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return ii0.Ooooo00(cause2);
            case 8:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                AbstractC2200wl.f25321OooO00o.execute(new c60(6, (InputStream) obj, parcelFileDescriptorArrCreatePipe[1]));
                return ii0.OooooOO(parcelFileDescriptor);
            case 9:
                return ii0.OooooOO(new r90((String) obj, 1));
            case 10:
                return ((Throwable) obj) instanceof TimeoutException ? ii0.OooooOO(new r90(Integer.toString(17), 1)) : ii0.OooooOO(new r90(null, 1));
            case 11:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return appSetIdInfo == null ? ii0.OooooOO(new da0(null, -1, 0)) : ii0.OooooOO(new da0(appSetIdInfo.getId(), appSetIdInfo.getScope(), 0));
            case 12:
                GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
                if (getTopicsResponse == null) {
                    return ii0.OooooOO(new da0("", 1, 2));
                }
                v11 v11VarOooOo0o = w11.OooOo0o();
                for (Topic topic : getTopicsResponse.getTopics()) {
                    t11 t11VarOooOo0o = u11.OooOo0o();
                    int topicId = topic.getTopicId();
                    t11VarOooOo0o.OooO0Oo();
                    ((u11) t11VarOooOo0o.f25822OooOo0o).zzc = topicId;
                    long modelVersion = topic.getModelVersion();
                    t11VarOooOo0o.OooO0Oo();
                    ((u11) t11VarOooOo0o.f25822OooOo0o).zzd = modelVersion;
                    long taxonomyVersion = topic.getTaxonomyVersion();
                    t11VarOooOo0o.OooO0Oo();
                    ((u11) t11VarOooOo0o.f25822OooOo0o).zze = taxonomyVersion;
                    u11 u11Var = (u11) t11VarOooOo0o.OooO0O0();
                    v11VarOooOo0o.OooO0Oo();
                    w11.OooOo((w11) v11VarOooOo0o.f25822OooOo0o, u11Var);
                }
                return ii0.OooooOO(new da0(Base64.encodeToString(((w11) v11VarOooOo0o.OooO0O0()).OooO0Oo(), 1), 1, 2));
            case 13:
                AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                return appSetIdInfo2 == null ? ii0.OooooOO(new da0(null, -1, 3)) : ii0.OooooOO(new da0(appSetIdInfo2.getId(), appSetIdInfo2.getScope(), 3));
            case 14:
                return yp0.f25991OooOo0o;
            default:
                return ii0.OooooOO("");
        }
    }
}
