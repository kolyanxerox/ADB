package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.NetworkIOException;
import java.util.concurrent.CancellationException;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOO0O;
import oo00o.OooOOO0;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateConfig$doWork$2", m13472f = "InitializeStateConfig.kt", m13473l = {32}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeStateConfig$doWork$2 extends OooOOOO implements o00O0O {
    final /* synthetic */ InitializeStateConfig.Params $params;
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$2(InitializeStateConfig.Params params, InitializeStateConfig initializeStateConfig, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$params = params;
        this.this$0 = initializeStateConfig;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new InitializeStateConfig$doWork$2(this.$params, this.this$0, oooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        Throwable thOooO00o;
        Object objMo13784invokegIAlus;
        Configuration configuration = "Unity Ads init: load configuration from ";
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    InitializeStateConfig.Params params = this.$params;
                    InitializeStateConfig initializeStateConfig = this.this$0;
                    DeviceLog.info("Unity Ads init: load configuration from " + SdkProperties.getConfigUrl());
                    Configuration configuration2 = new Configuration(SdkProperties.getConfigUrl(), params.getConfig().getExperimentsReader());
                    InitializeStateConfigWithLoader initializeStateConfigWithLoader = initializeStateConfig.initializeStateConfigWithLoader;
                    InitializeStateConfigWithLoader.Params params2 = new InitializeStateConfigWithLoader.Params(configuration2);
                    this.L$0 = configuration2;
                    this.label = 1;
                    objMo13784invokegIAlus = initializeStateConfigWithLoader.mo13784invokegIAlus((BaseParams) params2, (OooO0OO) this);
                    configuration = configuration2;
                    if (objMo13784invokegIAlus == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Configuration configuration3 = (Configuration) this.L$0;
                    o000OOo.OooOO0O(obj);
                    objMo13784invokegIAlus = ((OooOOO0) obj).f33191OooOo0O;
                    configuration = configuration3;
                }
                o000OOo.OooOO0O(objMo13784invokegIAlus);
                objOooO0O0 = (Configuration) objMo13784invokegIAlus;
            } catch (NetworkIOException e) {
                throw new InitializationException(ErrorState.NetworkConfigRequest, e, configuration);
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if ((objOooO0O0 instanceof OooOO0O) && (thOooO00o = OooOOO0.OooO00o(objOooO0O0)) != null) {
            objOooO0O0 = o000OOo.OooO0O0(thOooO00o);
        }
        return new OooOOO0(objOooO0O0);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((InitializeStateConfig$doWork$2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
