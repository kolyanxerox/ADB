package com.google.android.gms.ads.internal.offline.buffering;

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
public class OfflinePingSender extends Worker {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final InterfaceC1605gh f16114OooOo0O;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f16114OooOo0O = zzbc.zza().zzo(context, new BinderC2082te());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.f16114OooOo0O.zzh();
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
