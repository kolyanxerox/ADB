package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateReset;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", m13472f = "InitializeStateReset.kt", m13473l = {41}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeStateReset$doWork$2 extends OooOOOO implements o00O0O {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r8.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r8.L$1
            com.unity3d.services.core.domain.task.InitializeStateReset r0 = (com.unity3d.services.core.domain.task.InitializeStateReset) r0
            java.lang.Object r1 = r8.L$0
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = (com.unity3d.services.core.domain.task.InitializeStateReset.Params) r1
            o00O0.o000OOo.OooOO0O(r9)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            goto L5f
        L16:
            r9 = move-exception
            goto Lc0
        L19:
            r9 = move-exception
            goto Ld9
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            o00O0.o000OOo.OooOO0O(r9)
            com.unity3d.services.core.domain.task.InitializeStateReset$Params r1 = r8.$params
            com.unity3d.services.core.domain.task.InitializeStateReset r9 = r8.this$0
            java.lang.String r4 = "Unity Ads init: starting init"
            com.unity3d.services.core.log.DeviceLog.debug(r4)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r4 == 0) goto L39
            r4.resetWebViewAppInitialization()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        L39:
            if (r4 == 0) goto L40
            com.unity3d.services.core.webview.WebView r5 = r4.getWebView()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            goto L41
        L40:
            r5 = r3
        L41:
            if (r5 == 0) goto L6d
            com.unity3d.services.core.configuration.Configuration r5 = r1.getConfig()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            long r5 = r5.getWebViewAppCreateTimeout()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1 r7 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r7.<init>(r9, r4, r3)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r8.L$0 = r1     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r8.L$1 = r9     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r8.label = r2     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.lang.Object r2 = o00O0oOo.o0000OO0.Oooo00o(r5, r7, r8)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r2 != r0) goto L5d
            return r0
        L5d:
            r0 = r9
            r9 = r2
        L5f:
            oo00o.OooOo r9 = (oo00o.OooOo) r9     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto L65
            r9 = r0
            goto L6d
        L65:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.lang.String r0 = "Reset failed on opening ConditionVariable"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            throw r9     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        L6d:
            com.unity3d.services.core.domain.task.InitializeStateReset.access$unregisterLifecycleCallbacks(r9)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(r3)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(r3)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.io.File r9 = com.unity3d.services.core.properties.SdkProperties.getCacheDirectory()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto Lb8
            java.io.File r9 = com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r9 == 0) goto Lb0
            r9 = 0
            com.unity3d.services.core.properties.SdkProperties.setInitialized(r9)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.configuration.Configuration r0 = r1.getConfig()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.lang.Class[] r0 = r0.getModuleConfigurationList()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r0 != 0) goto L92
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        L92:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        L93:
            if (r9 >= r2) goto Lab
            r3 = r0[r9]     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.configuration.Configuration r4 = r1.getConfig()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            com.unity3d.services.core.configuration.IModuleConfiguration r3 = r4.getModuleConfiguration(r3)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            if (r3 == 0) goto La8
            com.unity3d.services.core.configuration.Configuration r4 = r1.getConfig()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            r3.resetState(r4)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        La8:
            int r9 = r9 + 1
            goto L93
        Lab:
            com.unity3d.services.core.configuration.Configuration r9 = r1.getConfig()     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            goto Lc4
        Lb0:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.lang.String r0 = "WebView cache directory is NULL"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            throw r9     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        Lb8:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            java.lang.String r0 = "Cache directory is NULL"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
            throw r9     // Catch: java.lang.Throwable -> L16 java.util.concurrent.CancellationException -> L19
        Lc0:
            oo00o.OooOO0O r9 = o00O0.o000OOo.OooO0O0(r9)
        Lc4:
            boolean r0 = r9 instanceof oo00o.OooOO0O
            if (r0 != 0) goto Lc9
            goto Ld3
        Lc9:
            java.lang.Throwable r0 = oo00o.OooOOO0.OooO00o(r9)
            if (r0 == 0) goto Ld3
            oo00o.OooOO0O r9 = o00O0.o000OOo.OooO0O0(r0)
        Ld3:
            oo00o.OooOOO0 r0 = new oo00o.OooOOO0
            r0.<init>(r9)
            return r0
        Ld9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((InitializeStateReset$doWork$2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
