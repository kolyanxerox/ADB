package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOO0O;
import oo00o.OooOOO0;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", m13472f = "InitializeStateComplete.kt", m13473l = {}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeStateComplete$doWork$2 extends OooOOOO implements o00O0O {
    final /* synthetic */ InitializeStateComplete.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$params = params;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new InitializeStateComplete$doWork$2(this.$params, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        Throwable thOooO00o;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        InitializeStateComplete.Params params = this.$params;
        try {
            Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            OooOo.OooO0Oo(moduleConfigurationList, "params.config.moduleConfigurationList");
            for (Class cls : moduleConfigurationList) {
                IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.initCompleteState(params.getConfig());
                }
            }
            objOooO0O0 = oo00o.OooOo.f33195OooO00o;
        } catch (CancellationException e) {
            throw e;
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
        return ((InitializeStateComplete$doWork$2) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }
}
