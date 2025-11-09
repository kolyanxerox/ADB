package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.CancellationException;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOO0O;
import oo00o.OooOOO0;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", m13472f = "InitializeStateNetworkError.kt", m13473l = {39}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeStateNetworkError$doWork$2 extends OooOOOO implements o00O0O {
    final /* synthetic */ InitializeStateNetworkError.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2(InitializeStateNetworkError initializeStateNetworkError, InitializeStateNetworkError.Params params, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new InitializeStateNetworkError$doWork$2(this.this$0, this.$params, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        Throwable thOooO00o;
        InitializeStateNetworkError initializeStateNetworkError;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        try {
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                InitializeStateNetworkError.Params params = this.$params;
                DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                Object objOooo00o = o0000OO0.Oooo00o(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (objOooo00o == oooOo00) {
                    return oooOo00;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = objOooo00o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (InitializeStateNetworkError) this.L$0;
                o000OOo.OooOO0O(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (((OooOo) obj) == null) {
            ConnectivityMonitor.removeListener(initializeStateNetworkError);
            throw new Exception("No connected events within the timeout!");
        }
        objOooO0O0 = OooOo.f33195OooO00o;
        if ((objOooO0O0 instanceof OooOO0O) && (thOooO00o = OooOOO0.OooO00o(objOooO0O0)) != null) {
            objOooO0O0 = o000OOo.OooO0O0(thOooO00o);
        }
        return new OooOOO0(objOooO0O0);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((InitializeStateNetworkError$doWork$2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
