package com.unity3d.ads.adplayer;

import com.ironsource.C3034d9;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0.o0ooOOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0o;
import o00O0oOo.o000OO;
import o00O0oo.o0000oo;
import o00O0ooo.o0OO;
import o00O0ooo.o0OO0oO0;
import o00O0ooo.o0OOO00;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OOo000;
import o00O0ooo.o0o0000;
import oo00o.OooOO0;
import oo00o.OooOo;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final o0OO0oO0 _onInvocation;
    private final o0OO callbacks;
    private final o0OOO0OO onInvocation;
    private final o000OO scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    @OooO(m13471c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", m13472f = "CommonWebViewBridge.kt", m13473l = {33}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1 */
    public static final class C39601 extends OooOOOO implements o00O0O {
        int label;

        public C39601(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return CommonWebViewBridge.this.new C39601(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39601) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", m13472f = "CommonWebViewBridge.kt", m13473l = {127, 129, 130, 131, 132, 139}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7 */
    public static final class C39617 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        Object L$0;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        @OooO(m13471c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", m13472f = "CommonWebViewBridge.kt", m13473l = {129}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Invocation invocation, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$invocation = invocation;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                return new AnonymousClass1(this.$invocation, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o000O0o o000o0oIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (o000o0oIsHandled.OooO0OO(this) == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                }
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39617(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C39617(this.$location, this.$parameters, this.this$0, this.$callback, oooO0OO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        
            if (r6.this$0.respond(r6.$callback, "OK", new java.lang.Object[]{r7}, r6) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
        
            if (r1.respond(r3, "ERROR", new java.lang.Object[]{r7}, r6) != r0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: Exception -> 0x001a, PHI: r1
  0x006e: PHI (r1v14 com.unity3d.ads.adplayer.Invocation) = (r1v11 com.unity3d.ads.adplayer.Invocation), (r1v16 com.unity3d.ads.adplayer.Invocation) binds: [B:21:0x006a, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001a, blocks: (B:7:0x0015, B:10:0x001d, B:26:0x007a, B:28:0x007e, B:31:0x008c, B:13:0x0025, B:23:0x006e, B:20:0x0055), top: B:46:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[Catch: Exception -> 0x001a, PHI: r7
  0x007a: PHI (r7v16 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:24:0x0077, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001a, blocks: (B:7:0x0015, B:10:0x001d, B:26:0x007a, B:28:0x007e, B:31:0x008c, B:13:0x0025, B:23:0x006e, B:20:0x0055), top: B:46:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:7:0x0015, B:10:0x001d, B:26:0x007a, B:28:0x007e, B:31:0x008c, B:13:0x0025, B:23:0x006e, B:20:0x0055), top: B:46:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: Exception -> 0x001a, TRY_LEAVE, TryCatch #0 {Exception -> 0x001a, blocks: (B:7:0x0015, B:10:0x001d, B:26:0x007a, B:28:0x007e, B:31:0x008c, B:13:0x0025, B:23:0x006e, B:20:0x0055), top: B:46:0x0005 }] */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.C39617.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C39617) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.adplayer.CommonWebViewBridge", m13472f = "CommonWebViewBridge.kt", m13473l = {66, 68}, m13474m = "request")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 */
    public static final class C39621 extends o00O0OO0.OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39621(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(o0000O00 dispatcher, WebViewContainer webViewContainer, o000OO adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(dispatcher, "dispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(webViewContainer, "webViewContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        o00OO000.OooO0OO oooO0OOOooOo0o = o0000OO0.OooOo0o(o0000OO0.OooOo0o(adPlayerScope, dispatcher), new o0000O0O("CommonWebViewBridge"));
        this.scope = oooO0OOOooOo0o;
        this.callbacks = o0o0000.OooO0OO(o0ooOOo.f31250OooOo0O);
        o0OOo000 o0ooo000OooO00o = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
        this._onInvocation = o0ooo000OooO00o;
        this.onInvocation = new o0OOO00(o0ooo000OooO00o);
        o0000OO0.OooOo0(oooO0OOOooOo0o, null, new C39601(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, String str, OooO0OO oooO0OO) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", oooO0OO);
        return objEvaluateJavascript == OooOo00.f31365OooOo0O ? objEvaluateJavascript : OooOo.f33195OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, OooO0OO oooO0OO) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, C3034d9.i.f8177d + jSONArray + ']', oooO0OO);
        return objExecute == OooOo00.f31365OooOo0O ? objExecute : OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public o0OOO0OO getOnInvocation() {
        return this.onInvocation;
    }

    public final o000OO getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleCallback(java.lang.String r18, java.lang.String r19, java.lang.String r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String message) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    DeviceLog.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    o0000OO0.OooOo0(this.scope, null, new C39617(str4, jSONArray3, this, str3, null), 3);
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(message), e);
            }
        } catch (Exception e2) {
            DeviceLog.error("Error handling invocation from webview (" + message + ')');
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = e2.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, o0O0O00.OooOOo0(new OooOO0("reason_debug", message2), new OooOO0("webview_invocation", message)), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(message), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(java.lang.String r11, java.lang.String r12, java.lang.Object[] r13, o00O0O0O.OooO0OO r14) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C39621
            if (r1 == 0) goto L14
            r1 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r1 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C39621) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.label = r2
            goto L19
        L14:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r1 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r1.<init>(r14)
        L19:
            java.lang.Object r14 = r1.result
            o00O0O0o.OooOo00 r2 = o00O0O0o.OooOo00.f31365OooOo0O
            int r3 = r1.label
            r4 = 2
            if (r3 == 0) goto L3a
            if (r3 == r0) goto L32
            if (r3 != r4) goto L2a
            o00O0.o000OOo.OooOO0O(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.Object r11 = r1.L$0
            o00O0oOo.o00000 r11 = (o00O0oOo.o00000) r11
            o00O0.o000OOo.OooOO0O(r14)
            goto L94
        L3a:
            o00O0.o000OOo.OooOO0O(r14)
            o00O0oOo.o00000O0 r14 = o00O0oOo.o0000OO0.OooO00o()
            int r3 = r14.hashCode()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            o00O0ooo.o0OO r5 = r10.callbacks
        L4b:
            r6 = r5
            o00O0ooo.oO00000o r6 = (o00O0ooo.oO00000o) r6
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            oo00o.OooOO0 r9 = new oo00o.OooOO0
            r9.<init>(r3, r14)
            java.util.LinkedHashSet r8 = o00O0.o000OOo.OooO0oO(r8, r9)
            boolean r6 = r6.OooO0oO(r7, r8)
            if (r6 == 0) goto L4b
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r5.put(r11)
            r5.put(r12)
            r5.put(r3)
            int r11 = r13.length
            r12 = 0
        L74:
            if (r12 >= r11) goto L7d
            r3 = r13[r12]
            r5.put(r3)
            int r12 = r12 + r0
            goto L74
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            java.lang.String r12 = r5.toString()
            java.lang.String r13 = "arguments.toString()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r12, r13)
            r1.L$0 = r14
            r1.label = r0
            java.lang.Object r11 = r10.execute(r11, r12, r1)
            if (r11 != r2) goto L93
            goto La3
        L93:
            r11 = r14
        L94:
            r12 = 0
            r1.L$0 = r12
            r1.label = r4
            o00O0oOo.o00000O0 r11 = (o00O0oOo.o00000O0) r11
            java.lang.Object r11 = r11.OooOo0(r1)
            o00O0O0o.OooOo00 r12 = o00O0O0o.OooOo00.f31365OooOo0O
            if (r11 != r2) goto La4
        La3:
            return r2
        La4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, OooO0OO oooO0OO) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String string = jSONArray.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "arguments.toString()");
        Object objExecute = execute(handlerType, string, oooO0OO);
        return objExecute == OooOo00.f31365OooOo0O ? objExecute : OooOo.f33195OooO00o;
    }
}
