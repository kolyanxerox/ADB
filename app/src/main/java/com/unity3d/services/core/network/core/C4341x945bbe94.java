package com.unity3d.services.core.network.core;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.reflect.InvocationTargetException;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3", m13472f = "OkHttp3Client.kt", m13473l = {}, m13474m = "invokeSuspend")
/* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 */
/* loaded from: classes3.dex */
public final class C4341x945bbe94 extends OooOOOO implements o00O0O {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4341x945bbe94(HttpRequest httpRequest, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$request = httpRequest;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        C4341x945bbe94 c4341x945bbe94 = new C4341x945bbe94(this.$request, oooO0OO);
        c4341x945bbe94.I$0 = ((Number) obj).intValue();
        return c4341x945bbe94;
    }

    public final Object invoke(int i, OooO0OO oooO0OO) {
        return ((C4341x945bbe94) create(Integer.valueOf(i), oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o000OOo.OooOO0O(obj);
        StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(this.I$0, "Downloaded ", "% of ");
        sbOooOOo0.append(this.$request.getBaseURL());
        DeviceLog.debug(sbOooOOo0.toString());
        return OooOo.f33195OooO00o;
    }

    @Override // o00O0Oo.o00O0O
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (OooO0OO) obj2);
    }
}
