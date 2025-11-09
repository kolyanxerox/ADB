package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bo */
/* loaded from: classes2.dex */
public final class C2684bo extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static long f5271 = 0;

    /* renamed from: ﻛ */
    private static int f5272 = 0;

    /* renamed from: ﾇ */
    private static char[] f5273 = null;

    /* renamed from: ﾒ */
    private static int f5274 = 1;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("ñ'\u0017b=\u008fB h`\u008e\u0090\u0097;½tÃ\u008fè6\u000e`\u0014\u0086\u0000^æ\nÌÈ³Y\u0099\u0004\u007fÊf*L\u00072\u009b\u0019Zÿ8å\u0096\u0000Hæ/ÌÜ³p\u0099\u0015\u007fö\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfGL52Þ\u0019rÿ.åÝÌd²2\u0098Ñ\u007fx\u0000Pæ:ÌÍ³a\u0099=\u007fÃfaL42Ä\u0019Rÿ%åÂÌm\u0000Aæ2e©\u0083Þ©1Ö\u008aüÛ\u001a'\u0003\u008c)ÙW>|\u0092\u009aù\u00800©\u0089××ý<\u001a\u0095\u0094dr\u0010Xý'Z\r\u0003ëûòTØ\u000b¦à\u008ddk\tqõXH&.\fáëJñ5\u0086 `GJ´5\u0018\u001f}ù\u009eà<Ê@´·\u009f\u001eyQc¨J\u00144_\u001e¹ù\u0011NÈ¨¯\u0082\\ýð×\u00951v(Ó\u0002¿|RWÐ±µ«W\u0082ÿü\u0089Ö]1þ+\u0088\u0005u|àV\u008d°K«ï\u0085\u0086ÿVÖõ0¨*]\u0005ä\u007fªY_°æ|\u0007\u009a]°¥ÏHåT\u0003³\u001a\u00100LN¹e\u001a\u0083\u0016\u0099·°\u0002Î^ä¢\u0003\u0001\u0019m7¶NFdu\u0082¸\u0099\u0001·.Í¹ä\u0006\u0002c\u0018¨7\u001eMek¹\u0082\u0003\u0098 ¶ìÍ\u000bëx\u0001Ô\u001816RL÷k\u001b\u0081v\u009fô¶\u0011ÌsêÛ\u0001-\u001fy5ÚL,jQ\u0080Ä\u009f)µoÓËê\"\u0000r\u001eÑ5\fSyiÀ\u0080\u000e\u009e{´Â\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfJL52ÿ\u0019`ÿ:å×Ìz²-\u0098õ\u007fie\u0014Kß2z\u0018\u000bþÌåw\u0000cæ9ÌÁ³,\u00990\u007f×ftL(2Ý\u0019~ÿråÓÌf²:\u0098Æ\u007fee\tKÒ2\"\u0018\u0011þÜåeËJ±Û\u0098s~\u0012dÕKd1\u0001\u0017ÊþmäDÊ\u0088±o\u0097\u001c}°dUJ60\u008a\u0017uý?ã Êz°\u0017\u0096º}mc5I©0T\u0016\u001füºãKÉ\f¯·\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfKL<2Ö\u0019cÿ.åäÌa²;\u0098Ã\u007foe\u0012K÷2o\u0018\u0016þÑåxË\r±Î\u0098i;\u0015ÝO÷·\u0088Z¢FD¡]\u0002w^\t«\"\bÄ\u0004Þ¥÷\u0010\u0089L£°D\u0013^\u007fp¤\tT#gÅªÞ\u0013ð<\u008a\u00ad£\u0005Ed_£p\u0012\nw,¼Å\u001bß2ñþ\u008a\u0019¬jFÆ_#q@\u000bý,\nÆ`ØÕñ\u0018\u008bR\u00ad×F\rXurÙ\u000b$-AÇÙØ òg\u0094Î\u00ad;GxYß\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfVL?2Á\u0019sÿ5åÀÌm²:\u0098ý\u007fde\u0006KÙ2~\u0018\u000fþÙåzË\r±Õ\u0098~~'dßKf1\u0001\u0017Èþ}ä\u001eÊ¹N\u008c¨Ö\u0082.ýÃ×ß18(\u009b\u0002Ç|2W\u0091±\u009d«<\u0082\u0089üÕÖ)1\u008a+æ\u0005=|ÍVþ°3«\u008a\u0085¥ÿ4Ö\u009c0ý*:\u0005\u008b\u007fîY%°\u0082ª«\u0084gÿ\u0080Ùó3_*º\u0004Ù~yY\u0090³î\u00ad\\\u0084\u009aþïØB3\u0095-Ò\u0007K~©Xö²Q\u00ad \u0087öáUØ¢2ú,Q\u0007\u0088að[I²®¬ç\u0086Rá±Û\u0016\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfFL;2Ã\u0019cÿ\nåÛÌm²)\u0098÷\u007fee\u000eKÂ2~\u0018\rþÔåbË\u0001±È*ÒÌµæF\u0099ê³\u008fUlLÈf¡\u0018Y3èÕ\u0090ÏAæ÷\u0098³²mUÿO\u0094aX\u0018ä2\u0097ÔNÏøá\u009b\u009bR\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfSL?2Ò\u0019Rÿ.åÓÌn²8\u0098Ý\u007fie6Kß2i\u0018\u0015þûåaË\n±Î\u0098b~\tdÐK~1\r\u0017Ìëò\r\u008d'wXÚr\u0097\u0094P\u008dØ§\u0084ÙeòÞ\u0014¤\u000ea'ÁY\u008as}\u0094Î\u0000Wæ3ÌÎ³V\u0099*\u007fÏfbL<2Ù\u0019eÿ\u0013åÐÌb²;\u0098×\u007f~\tãï\u0087Åzºâ\u0090\u009ev{oÖE\u0088;m\u0010Ñö½ìTÅð4EÒ\"øÑ\u0087}\u00ad\u0018KûREx2\u0006Ü-yË?Ñòøj\u0086!¬ÜKDQ\u0002\u007fÕ\u0006u,\u001dÊÚÑoÿ\u0005\u0085Ò¬o6AÐ&úÕ\u0085y¯\u001cIÿP@z!\u0004Ø/fÉ1Óíúh\u00842®ÊI@S\u0006}Ñ\u0004q.\u0019ÈÞÓký\u0001\u0087Ö®k\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfKL<2Ö\u0019cÿ.ååÌm²<\u0098â\u007fce\u0005KÁ2O\u0018\rþÖåzË\u0016±Õ\u0098|~\ndÙK`\u001b,ýK×¸¨\u0014\u0082qd\u0092}7W[)¶\u00024äQþ³×\u001b\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfSL?2Ò\u0019Pÿ5å×Ì\u007f²\u001d\u0098Ø\u007fce\u0005KØ2x\u0000Hæ/ÌÜ³p\u0099\u0015\u007föfKL<2Ö\u0019cÿ.åäÌa²;\u0098Ã\u007foe\u0012Kþ2m\u0018\fþÜåbË\u0001±ÈEÎ£±\u0089KöæÜ«:y#ì\t¾wF\\âº¯ {\u0089è÷±ÝQ:ç \u0084\u000eEwÁ]\u008a»J û\u008e\u0080ôUÝô;\u0095ø9\u001e^4\u00adK\u0001ad\u0087\u0087\u009e&´@Ê¨á\u0007\u0007n\u001d¬4\u0017J[`·\u0087\u0014\u009d}³«Ê\u0018àaÊS,4\u0006ÇykS\u000eµí¬L\u0086*øÂÓm5\u0004/Æ\u0006}x1RÝµ~¯\u0017\u0081ÁørÒ\u000b4ï/|\u0001\f{ÕRn´\u0013®Â\u0081{\u0019\rÿjÕ\u0099ª5\u0080Pf³\u007f\u0003Um+\u009a\u00004æjü\u0092Õ?«Z\u0081\u0092f;|LR\u0085+ \u0001Sç\u0084\u0000cæ9ÌÁ³,\u00990\u007f×ftL(2Ý\u0019~ÿråÓÌf²:\u0098Æ\u007fee\tKÒ2\"\u0018\u0011þÜåeËJ±Õ\u0098f~\u0003dÎK~1\t\u0017Çþ:ä\"Ê¹±f\u0097\u001e}\u008fd@J,0¶\u0017uý\u0007ãµÊy°\u0000\u0096\u0089}}c\u0000I£0V\u0016\u001fü¸ã[\u0000gæ3ÌØ³U\u0099=\u007fÌfPL(2Ñ\u0019`ÿ:åÛÌk²\u0011\u0098Ö\u007f`e\u0005KÕ2x\u00187þÊåbË\u0017\u0000gæ3ÌØ³M\u0099>\u007fÈfaL(2ó\u0019gÿ?åÚÌm²\u001d\u0098Ø\u007fce\u0003KÝ2X\u0018\nþÊåaË\u0011±Ý\u0098x~3dÎK~G¨¡ü\u008b\u0017ô\u008cÞó85!²\u000båu\u001a\u0000gæ3ÌØ³R\u00994\u007fÏfgL?2Ý\u0019cÿ2åÆÌ\\²'\u0098Ä\u007foe%KØ2y\u0018\u000f\u0000gæ3ÌØ³F\u0099=\u007fÞfaL42Ô\u0019cÿ2åÑÌq²\u0016\u0098Û\u007ffe\u0004KÓ2~\u0018+þÖå}Ë\u0010±Û\u0098~~\u0005dÙ\u008eCh\u0017Bü=b\u0017\u0015ñùèTÂ\f¼ý\u0097@q\rkâBC<\b\u0016ÙñJ\u0000gæ3ÌØ³R\u00994\u007fÏfgL?2Ý\u0019cÿ2åÆÌK²1\u0098Ú\u007f~e\u0012KÙ2`\u0018\u000eþÝå|\u0000gæ3ÌØ³R\u0099*\u007fËfhL52Ñ\u0019bÿ9åÖÌL²?\u0098À\u007fk\u000e|è(ÂÃ½I\u0097\"qÇh~B,<Î\u0017iñ\"ëÛÂ`\u0000Ræ\u0013Ìû³C\u0099\n\u007fêfAL\u001e:øÜ©öI\u0089ö£»EL\\áv¢\bU#þÅ¬ßO\u0000Iæ\u0018Ìú³C\u0099\u0014\u007fçf@tý\u0092ª¸KÇîí¢\u000bS\u0012þ8½FJmô\u008b£\u0091H¸áÆ¨ìC".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1080);
        f5273 = cArr;
        f5271 = -3586115473121089962L;
    }

    public C2684bo(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    private static DependencyHolder m5664() {
        f5272 = (f5274 + 19) % 128;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        f5272 = (f5274 + 47) % 128;
        return dependencyHolder;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ DependencyHolder m5665() {
        int i = f5272 + 5;
        f5274 = i % 128;
        if (i % 2 == 0) {
            m5664();
            throw null;
        }
        DependencyHolder dependencyHolderM5664 = m5664();
        int i2 = f5272 + 1;
        f5274 = i2 % 128;
        if (i2 % 2 != 0) {
            return dependencyHolderM5664;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ PlacementController m5667(HyprMXController hyprMXController) {
        f5274 = (f5272 + 107) % 128;
        PlacementController placementControllerM5672 = m5672(hyprMXController);
        int i = f5274 + InterfaceC3173h3.d.b.f8819b;
        f5272 = i % 128;
        if (i % 2 != 0) {
            int i2 = 0 / 0;
        }
        return placementControllerM5672;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ PreloadedVastData m5670(DependencyHolder dependencyHolder) {
        f5272 = (f5274 + 75) % 128;
        PreloadedVastData preloadedVastDataM5671 = m5671(dependencyHolder);
        f5272 = (f5274 + 109) % 128;
        return preloadedVastDataM5671;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Object m5674(String str) {
        int i = f5274 + 107;
        f5272 = i % 128;
        if (i % 2 == 0) {
            return m5666(str);
        }
        m5666(str);
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5679(Ad ad) {
        int i = f5274 + 123;
        f5272 = i % 128;
        if (i % 2 == 0) {
            return m5675(ad);
        }
        m5675(ad);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:122:0x056e  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2684bo.mo5382(java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* renamed from: ﱡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object m5666(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 2
            r2 = 3
            r3 = 0
            r5 = 1
            r6 = 0
            java.lang.String r7 = ""
            switch(r0) {
                case -1617199657: goto L89;
                case -1372958932: goto L61;
                case -65580248: goto L34;
                case 543046670: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Lac
        L11:
            int r0 = android.widget.ExpandableListView.getPackedPositionGroup(r3)
            int r0 = 8 - r0
            int r3 = android.text.TextUtils.indexOf(r7, r7)
            int r3 = r3 + 1038
            int r4 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r4 = r4 >> 16
            char r4 = (char) r4
            java.lang.String r0 = m5678(r0, r3, r4)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto Lac
            goto Lad
        L34:
            int r0 = android.text.TextUtils.indexOf(r7, r7)
            int r0 = 15 - r0
            int r3 = android.text.TextUtils.indexOf(r7, r7)
            int r3 = r3 + 1065
            int r4 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r4 = r4 >> 24
            int r4 = 29875 - r4
            char r4 = (char) r4
            java.lang.String r0 = m5678(r0, r3, r4)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto Lac
            int r8 = com.ironsource.adqualitysdk.sdk.p009i.C2684bo.f5274
            int r8 = r8 + 109
            int r8 = r8 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2684bo.f5272 = r8
            r6 = r2
            goto Lad
        L61:
            r0 = 48
            int r3 = android.text.TextUtils.lastIndexOf(r7, r0)
            int r3 = 11 - r3
            int r4 = android.view.ViewConfiguration.getScrollBarSize()
            int r4 = r4 >> 8
            int r4 = 1046 - r4
            int r0 = android.text.TextUtils.indexOf(r7, r0, r6, r6)
            int r0 = r0 + 15026
            char r0 = (char) r0
            java.lang.String r0 = m5678(r3, r4, r0)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == r5) goto L87
            goto Lac
        L87:
            r6 = r5
            goto Lad
        L89:
            int r0 = android.view.ViewConfiguration.getScrollBarSize()
            int r0 = r0 >> 8
            int r0 = r0 + 7
            int r6 = android.text.TextUtils.indexOf(r7, r7, r6, r6)
            int r6 = 1058 - r6
            int r3 = android.widget.ExpandableListView.getPackedPositionGroup(r3)
            char r3 = (char) r3
            java.lang.String r0 = m5678(r0, r6, r3)
            java.lang.String r0 = r0.intern()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto Lac
            r6 = r1
            goto Lad
        Lac:
            r6 = -1
        Lad:
            if (r6 == 0) goto Lc8
            if (r6 == r5) goto Lc5
            if (r6 == r1) goto Lc2
            if (r6 == r2) goto Lbf
            int r8 = com.ironsource.adqualitysdk.sdk.p009i.C2684bo.f5272
            int r8 = r8 + 111
            int r8 = r8 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2684bo.f5274 = r8
            r8 = 0
            return r8
        Lbf:
            com.hyprmx.android.sdk.placement.PlacementType r8 = com.hyprmx.android.sdk.placement.PlacementType.NOT_INITIALIZED
            return r8
        Lc2:
            com.hyprmx.android.sdk.placement.PlacementType r8 = com.hyprmx.android.sdk.placement.PlacementType.INVALID
            return r8
        Lc5:
            com.hyprmx.android.sdk.placement.PlacementType r8 = com.hyprmx.android.sdk.placement.PlacementType.INTERSTITIAL
            return r8
        Lc8:
            com.hyprmx.android.sdk.placement.PlacementType r8 = com.hyprmx.android.sdk.placement.PlacementType.REWARDED
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2684bo.m5666(java.lang.String):java.lang.Object");
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ List m5669(WebTrafficObject webTrafficObject) {
        f5272 = (f5274 + 115) % 128;
        List<WebTrafficObject.WebTrafficURL> listM5673 = m5673(webTrafficObject);
        f5272 = (f5274 + 21) % 128;
        return listM5673;
    }

    /* renamed from: ﾇ */
    private static JSONObject m5677(PreloadedVastData preloadedVastData) {
        f5272 = (f5274 + 71) % 128;
        JSONObject parameters = preloadedVastData.getParameters();
        int i = f5272 + 67;
        f5274 = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
        return parameters;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5680(OfferCacheEntity offerCacheEntity) {
        int i = f5272 + 95;
        f5274 = i % 128;
        if (i % 2 == 0) {
            m5668(offerCacheEntity);
            throw null;
        }
        String strM5668 = m5668(offerCacheEntity);
        int i2 = f5272 + 9;
        f5274 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return strM5668;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5678(23 - (ViewConfiguration.getPressedStateDuration() >> 16), 864 - TextUtils.getTrimmedLength(""), (char) KeyEvent.normalizeMetaState(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5669((WebTrafficObject) list.get(0));
            }
        });
        map.put(m5678(ExpandableListView.getPackedPositionChild(0L) + 29, (Process.myPid() >> 22) + 887, (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5680((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m5678(TextUtils.indexOf("", "", 0) + 9, 915 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 18383)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5679((Ad) list.get(0));
            }
        });
        map.put(m5678(20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 924, (char) (Process.myPid() >> 22)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5674((String) list.get(0));
            }
        });
        map.put(m5678(27 - (ViewConfiguration.getEdgeSlop() >> 16), 944 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5665();
            }
        });
        map.put(m5678(16 - (ViewConfiguration.getLongPressTimeout() >> 16), 971 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 36388)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5681((DependencyHolder) list.get(0));
            }
        });
        map.put(m5678((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, 987 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5667((HyprMXController) list.get(0));
            }
        });
        map.put(m5678((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, 1009 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getOffsetAfter("", 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5670((DependencyHolder) list.get(0));
            }
        });
        map.put(m5678(12 - ((byte) KeyEvent.getModifierMetaStateMask()), 1025 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 3612)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2684bo.m5682((PreloadedVastData) list.get(0));
            }
        });
        int i = f5274 + 71;
        f5272 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m5668(OfferCacheEntity offerCacheEntity) {
        int i = f5272 + 65;
        f5274 = i % 128;
        int i2 = i % 2;
        String str = offerCacheEntity.clickThroughUrl;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5675(Ad ad) {
        f5272 = (f5274 + 73) % 128;
        String str = ad.type;
        f5272 = (f5274 + 7) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5681(DependencyHolder dependencyHolder) {
        int i = f5274 + 97;
        f5272 = i % 128;
        if (i % 2 == 0) {
            return m5676(dependencyHolder);
        }
        m5676(dependencyHolder);
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5676(DependencyHolder dependencyHolder) {
        f5274 = (f5272 + 5) % 128;
        String distributorId = dependencyHolder.getDistributorId();
        f5274 = (f5272 + 3) % 128;
        return distributorId;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ JSONObject m5682(PreloadedVastData preloadedVastData) {
        int i = f5274 + 25;
        f5272 = i % 128;
        if (i % 2 == 0) {
            return m5677(preloadedVastData);
        }
        m5677(preloadedVastData);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5272 = (f5274 + 93) % 128;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m5678(12 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0, 0), (char) (61808 - TextUtils.indexOf((CharSequence) "", '0'))).intern()).get(null);
                int i = f5274 + 73;
                f5272 = i % 128;
                if (i % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Exception unused) {
                return C2849hr.m6916().m6919().m6988(BuildConfig.class, m5678(TextUtils.getOffsetAfter("", 0) + 12, 12 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ */
    private static String m5678(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5273[i2 + i3] ^ (i3 * f5271)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ｋ */
    private static List<WebTrafficObject.WebTrafficURL> m5673(WebTrafficObject webTrafficObject) {
        int i = f5272 + 63;
        f5274 = i % 128;
        int i2 = i % 2;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        if (i2 == 0) {
            int i3 = 23 / 0;
        }
        return list;
    }

    /* renamed from: ｋ */
    private static PreloadedVastData m5671(DependencyHolder dependencyHolder) {
        f5272 = (f5274 + 89) % 128;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        f5274 = (f5272 + 85) % 128;
        return preloadedData;
    }

    /* renamed from: ｋ */
    private static PlacementController m5672(HyprMXController hyprMXController) {
        int i = f5274 + 125;
        f5272 = i % 128;
        int i2 = i % 2;
        PlacementController placementController = hyprMXController.getPlacementController();
        if (i2 != 0) {
            int i3 = 65 / 0;
        }
        return placementController;
    }
}
