package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.b8 */
/* loaded from: classes2.dex */
public class C2963b8 {

    /* renamed from: com.ironsource.b8$a */
    public class a implements WorkerManager.WorkEndedListener<C2998c8> {

        /* renamed from: a */
        final /* synthetic */ b f7578a;

        public a(b bVar) {
            this.f7578a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C2998c8>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C2998c8> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C2998c8) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC3861y7) ((WorkerResult.Canceled) workerResult).callable).m13174c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC3861y7 callableC3861y7 = (CallableC3861y7) failed.callable;
                    arrayList2.add(new C2998c8(callableC3861y7.m13175d(), callableC3861y7.m13174c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C2963b8.this.m7884a(arrayList2, arrayList, j);
            this.f7578a.mo7886a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String strOooOO0 = OooO0oO.OooOo.OooOO0("failed to collect bidding data, error= ", str);
            IronLog.INTERNAL.verbose(strOooOO0);
            this.f7578a.onFailure(strOooOO0);
        }
    }

    /* renamed from: com.ironsource.b8$b */
    public interface b {
        /* renamed from: a */
        void mo7886a(List<C2998c8> list, long j, List<String> list2);

        void onFailure(String str);
    }

    /* renamed from: a */
    public void m7885a(List<CallableC3861y7> list, b bVar, long j, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC3861y7> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("Exception - failed to collect bidding data, error= ", th);
            sbOooOOO.append(th.getMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(string);
            bVar.onFailure(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7884a(List<C2998c8> list, List<String> list2, long j) {
        IronLog ironLog;
        StringBuilder sb;
        String strM8102b;
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (C2998c8 c2998c8 : list) {
            if (c2998c8.m8101a() != null) {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(c2998c8.m8103c());
                sb.append(" - success (");
                sb.append(c2998c8.m8105e());
                strM8102b = " millis)";
            } else {
                ironLog = IronLog.INTERNAL;
                sb = new StringBuilder();
                sb.append(c2998c8.m8103c());
                sb.append(" - failed (");
                sb.append(c2998c8.m8105e());
                sb.append(" millis) error: ");
                strM8102b = c2998c8.m8102b();
            }
            sb.append(strM8102b);
            ironLog.verbose(sb.toString());
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
