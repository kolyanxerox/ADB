package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.ServiceProvider;
import kotlin.jvm.internal.OooOo;
import oo00o.OooO0OO;
import oo00o.OooO0o;

/* loaded from: classes3.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final OooO0OO getOperativeRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(workerParams, "workerParams");
        this.getOperativeRequestPolicy$delegate = o0OOO0.OooO0oO(OooO0o.f33184OooOo0o, new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ));
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(o00O0O0O.OooO0OO oooO0OO) {
        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
        return super.doWork(oooO0OO);
    }
}
