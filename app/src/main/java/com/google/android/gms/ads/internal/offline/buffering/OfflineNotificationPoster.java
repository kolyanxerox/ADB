package com.google.android.gms.ads.internal.offline.buffering;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.InterfaceC1605gh;

/* loaded from: classes2.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC1605gh f16113OooOo0O;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f16113OooOo0O = zzbc.zza().zzo(context, new BinderC2082te());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.f16113OooOo0O.Oooo0O0(new OooO0OO(getApplicationContext()), new zza(getInputData().getString("uri"), getInputData().getString("gws_query_id"), getInputData().getString("image_url")));
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
