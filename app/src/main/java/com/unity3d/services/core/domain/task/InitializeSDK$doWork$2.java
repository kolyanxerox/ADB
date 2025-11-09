package com.unity3d.services.core.domain.task;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.InterfaceC3173h3;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;
import org.apache.tika.pipes.PipesConfigBase;

@OooO(m13471c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", m13472f = "InitializeSDK.kt", m13473l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, 53, 58, PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS, 65, 67, 71, 74, 89, 92, 100, InterfaceC3173h3.d.b.f8821d, 106}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class InitializeSDK$doWork$2 extends OooOOOO implements o00O0O {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = initializeSDK;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, oooO0OO);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0339, code lost:
    
        if (r14 != r2) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0264 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bb A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030c A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031f A[Catch: all -> 0x001f, CancellationException -> 0x0022, PHI: r0 r1
  0x031f: PHI (r0v51 java.lang.Object) = (r0v49 java.lang.Object), (r0v49 java.lang.Object), (r0v54 java.lang.Object) binds: [B:125:0x030a, B:127:0x031c, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]
  0x031f: PHI (r1v48 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r1v45 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v45 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v51 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:125:0x030a, B:127:0x031c, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f A[PHI: r0 r1 r3 r5 r14
  0x007f: PHI (r0v25 java.lang.Object) = (r0v23 java.lang.Object), (r0v33 java.lang.Object) binds: [B:90:0x0230, B:28:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r1v27 com.unity3d.services.core.configuration.Configuration) = 
  (r1v24 com.unity3d.services.core.configuration.Configuration)
  (r1v35 com.unity3d.services.core.configuration.Configuration)
 binds: [B:90:0x0230, B:28:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r3v22 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v19 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v24 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:90:0x0230, B:28:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r5v13 o00O0oOo.o000OO) = (r5v10 o00O0oOo.o000OO), (r5v16 o00O0oOo.o000OO) binds: [B:90:0x0230, B:28:0x0078] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r14v34 java.lang.Object) = (r14v33 java.lang.Object), (r14v40 java.lang.Object) binds: [B:90:0x0230, B:28:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf A[PHI: r0 r1 r3 r14
  0x00cf: PHI (r0v9 com.unity3d.services.core.configuration.Configuration) = 
  (r0v6 com.unity3d.services.core.configuration.Configuration)
  (r0v14 com.unity3d.services.core.configuration.Configuration)
 binds: [B:69:0x01a9, B:40:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r1v16 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r1v13 com.unity3d.services.core.domain.task.InitializeSDK)
  (r1v19 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:69:0x01a9, B:40:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r3v10 o00O0oOo.o000OO) = (r3v7 o00O0oOo.o000OO), (r3v14 o00O0oOo.o000OO) binds: [B:69:0x01a9, B:40:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r14v19 java.lang.Object) = (r14v15 java.lang.Object), (r14v23 java.lang.Object) binds: [B:69:0x01a9, B:40:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01da A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fb A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0212 A[Catch: all -> 0x001f, CancellationException -> 0x0022, PHI: r0 r1 r3 r5
  0x0212: PHI (r0v23 java.lang.Object) = (r0v19 java.lang.Object), (r0v19 java.lang.Object), (r0v24 java.lang.Object) binds: [B:85:0x01f9, B:87:0x020e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r1v24 com.unity3d.services.core.configuration.Configuration) = 
  (r1v20 com.unity3d.services.core.configuration.Configuration)
  (r1v20 com.unity3d.services.core.configuration.Configuration)
  (r1v26 com.unity3d.services.core.configuration.Configuration)
 binds: [B:85:0x01f9, B:87:0x020e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r3v19 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v15 com.unity3d.services.core.domain.task.InitializeSDK)
  (r3v21 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:85:0x01f9, B:87:0x020e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x0212: PHI (r5v10 o00O0oOo.o000OO) = (r5v8 o00O0oOo.o000OO), (r5v8 o00O0oOo.o000OO), (r5v12 o00O0oOo.o000OO) binds: [B:85:0x01f9, B:87:0x020e, B:31:0x0092] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0238 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0258 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #2 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:6:0x0016, B:132:0x033c, B:13:0x002b, B:129:0x031f, B:16:0x0036, B:124:0x0308, B:126:0x030c, B:19:0x0047, B:117:0x02d1, B:120:0x02e2, B:22:0x0052, B:112:0x02b7, B:114:0x02bb, B:25:0x0060, B:97:0x0252, B:99:0x0258, B:100:0x0263, B:28:0x0078, B:92:0x0234, B:94:0x0238, B:101:0x0264, B:103:0x026f, B:105:0x0279, B:107:0x027f, B:108:0x0293, B:118:0x02dc, B:133:0x0342, B:134:0x0349, B:31:0x0092, B:89:0x0212, B:34:0x00a3, B:84:0x01f7, B:86:0x01fb, B:37:0x00b2, B:76:0x01c8, B:78:0x01ce, B:79:0x01d9, B:40:0x00c8, B:71:0x01ad, B:73:0x01b1, B:80:0x01da, B:43:0x00dc, B:62:0x016d, B:64:0x0173, B:65:0x0186, B:68:0x0190, B:46:0x00ed, B:58:0x014e, B:49:0x00fb, B:51:0x0116, B:53:0x011c), top: B:145:0x000b }] */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((InitializeSDK$doWork$2) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
