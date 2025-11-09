package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class CommonCleanAssets implements CleanAssets {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonCleanAssets", m13472f = "CommonCleanAssets.kt", m13473l = {18, 19}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 */
    public static final class C40961 extends OooO0OO {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40961(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCleanAssets.this.invoke(this);
        }
    }

    public CommonCleanAssets(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        OooOo.OooO0o0(cacheRepository, "cacheRepository");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.CleanAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(o00O0O0O.OooO0OO r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.unity3d.ads.core.domain.CommonCleanAssets.C40961
            if (r0 == 0) goto L13
            r0 = r15
            com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonCleanAssets.C40961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.J$1
            long r3 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonCleanAssets r0 = (com.unity3d.ads.core.domain.CommonCleanAssets) r0
            o00O0.o000OOo.OooOO0O(r15)
            goto L76
        L32:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3a:
            long r4 = r0.J$0
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonCleanAssets r2 = (com.unity3d.ads.core.domain.CommonCleanAssets) r2
            o00O0.o000OOo.OooOO0O(r15)
            goto L5c
        L44:
            o00O0.o000OOo.OooOO0O(r15)
            long r5 = o00O0oOO.OooOOOO.OooO0O0()
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r14.cacheRepository
            r0.L$0 = r14
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r15 = r15.getCacheSize(r0)
            if (r15 != r1) goto L5a
            goto L72
        L5a:
            r2 = r14
            r4 = r5
        L5c:
            java.lang.Number r15 = (java.lang.Number) r15
            long r6 = r15.longValue()
            com.unity3d.ads.core.data.repository.CacheRepository r15 = r2.cacheRepository
            r0.L$0 = r2
            r0.J$0 = r4
            r0.J$1 = r6
            r0.label = r3
            java.lang.Object r15 = r15.clearCache(r0)
            if (r15 != r1) goto L73
        L72:
            return r1
        L73:
            r0 = r2
            r3 = r4
            r1 = r6
        L76:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            o00O0oOO.OooOo r15 = new o00O0oOO.OooOo
            r15.<init>(r3)
            double r3 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r15)
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r3)
            r15 = 1024(0x400, float:1.435E-42)
            long r3 = (long) r15
            long r1 = r1 / r3
            int r15 = (int) r1
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r15)
            oo00o.OooOO0 r15 = new oo00o.OooOO0
            java.lang.String r1 = "size_kb"
            r15.<init>(r1, r0)
            java.util.Map r9 = o00O0.o0O0O00.OooOOOo(r15)
            r10 = 0
            r11 = 0
            java.lang.String r6 = "native_clean_assets_task_success_time"
            r8 = 0
            r12 = 52
            r13 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            oo00o.OooOo r15 = oo00o.OooOo.f33195OooO00o
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonCleanAssets.invoke(o00O0O0O.OooO0OO):java.lang.Object");
    }
}
