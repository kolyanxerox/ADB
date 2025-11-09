package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", m13472f = "CommonGetIsFileCache.kt", m13473l = {18}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 */
    public static final class C40981 extends OooO0OO {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40981(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetIsFileCache.this.invoke(null, this);
        }
    }

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(cacheRepository, "cacheRepository");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.String r13, o00O0O0O.OooO0OO r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache.C40981
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache.C40981) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.J$0
            java.lang.Object r13 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetIsFileCache r13 = (com.unity3d.ads.core.domain.CommonGetIsFileCache) r13
            o00O0.o000OOo.OooOO0O(r14)
            goto L53
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            o00O0.o000OOo.OooOO0O(r14)
            long r4 = o00O0oOO.OooOOOO.OooO0O0()
            java.lang.String r14 = "/"
            java.lang.String r13 = o00O0oO.o000000.Oooooo0(r13, r14)
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r12.cacheRepository
            r0.L$0 = r12
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r14 = r14.doesFileExist(r13, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            r13 = r12
            r1 = r4
        L53:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r13.sendDiagnosticEvent
            if (r0 == 0) goto L61
            java.lang.String r13 = "native_show_is_file_cached_success_time"
        L5f:
            r4 = r13
            goto L64
        L61:
            java.lang.String r13 = "native_show_is_file_cached_failure_time"
            goto L5f
        L64:
            o00O0oOO.OooOo r13 = new o00O0oOO.OooOo
            r13.<init>(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r13)
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r0)
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r10 = 60
            r11 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke(java.lang.String, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
