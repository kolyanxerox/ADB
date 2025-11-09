package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3018cs;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bv */
/* loaded from: classes2.dex */
public final class C2691bv extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static int f5419 = 0;

    /* renamed from: ﻛ */
    private static int f5420 = 1;

    /* renamed from: ｋ */
    private static long f5421;

    /* renamed from: ﾇ */
    private static char[] f5422;

    static {
        char[] cArr = new char[InterfaceC3018cs.a.f7816h];
        ByteBuffer.wrap("\u0000Aä\u0099É\u0085®\u0085\u0093\u009ex\u0086]\u0081B©'\u0099\f·ñ¯Ö¹»° Ú\u0085È\u0000Pä\u0097É\u0097®\u0092\u0093\u0089x\u008a]\u0087B³'¬\u0000Cä\u0094É\u0098®\u0085\u0093\u009ex\u0088]\u008eB±'½\f¡ñ\u008fÖª»° Ö\u0085ÌjÜOÄ4Ò\u0000cä\u0094É\u009b®ß\u0093\u0085x\u0095]\u008dB³'«\f¼ñ»Ö»»§ Ú\u0085\u0094jÆOÔ4À\u0019\u0088þÂãóÈù\u00adæ\u0092ÿwç\\ïA\u0012&\u001c\u000b\u0006ðAÕ)º\n\u009f\u000e\u0084/i$N>3 \u0018+ý'âOÇy¬P\u0091Zv@[R@v%n\nl8ÿÜ#ñ4\u0096\"«(@\"e z\u0002\u001f\u001a4\fÉ\u0019î\u0013\u00833\u0098j½xRjwp\ft!dÆn\u0000cä\u0094É\u009b®ß\u0093\u0085x\u0095]\u008dB³'«\f¼ñ»Ö»»§ Ú\u0085\u0094jÆOÔ4À\u0019\u0088þÂãóÈù\u00adæ\u0092ÿwç\\ïA\u0012&\u001c\u000b\u0006ðAÕ#º\u000b\u009f\u0014\u0084>i$N\"38\u0018.ý6âTÇY¬_\u0091ovJ[P@v%l\n|ïdÔr\u0000Oä\u008bÉ\u0093®\u009f\u0093¹x\u0095]\u008eB\u009c'»\f§ñ§Ö¿»\u00ad Ë\u0085Ã\u001e*úÝ×Ò°\u0096\u008dÌfÜCÄ\\ú9â\u0012õïòÈò¥î¾\u0093\u009bÝt\u008fQ\u009d*\u0089\u0007Áà\u008býºÖ°³¯\u008c¶i®B¦_[8U\u0015Oî\bËl¤\\\u0081L\u009a|wJPj-i\u0006Oãhü\u0000Ù\u0018²\f\u008f\u000eh\u0014E\u0014´ºPz}j\u001al'LÌ{édö\\\u0093H¸EE\u007fb[\u000fY\u0014\"1,Þ4û\u000f\u00809\u00ad,J=W\u001a|\u0010$\u001eÀéíæ\u008a¢·ø\\èyðfÎ\u0003Ö(ÁÕÆòÆ\u009fÚ\u0084§¡éN¥k¨\u0010²=²Ú½Ç\u0095ì\u0083\u0089\u0080¶\u009eS\u0086x\u009aeh\u0002*/@Ô`ñx\u009ev»N IM^j^\u0017R<_Ù}Æ!ã+\u0088 µ6R&\u007f\u0015d\u0003\u0001\u001e.\u0007Ë\u0018ð\u0002\"ÌÆ-ë1\u008c\u0015±\u0007Z\f\u007f\u0002`*\u0005\u000e.?Ó1ô)F\u001b¢Ã\u008fÁèÆÕÐ>Ì\u001bè\u0004éaàJù·ÿ\u0090Üýôæ\u0095Ã\u0097,\u0089\t\u0087r\u0097_\u008d\u0000Iä\u0089É\u0099®\u009f\u0093¿x\u0088]\u0097B¯'»\f¶ÈQ,\u008e\u0001\u009ef\u009b[\u0091°\u008c\u0095\u0089\u008a¬ï¯Ä¥9\u0092\u001e°s¨hÆ\u0000Iä\u0096É\u0086®\u0083\u0093\u0089x\u0094]\u0091B´'·\f½ñ\u008aÖ¨»° Þ\u0085öjÜOÃ4ß\u0019ÃþÏãùÈå^ìº\u0007\u0097\u001cð\u0018Í &\u0019\u0003#\u001c\u0010y\u0007Ó¿7H\u001aG}\u0003@Q«V\u008e_\u0091{ôkßa\"<\u0005qh}s\u0015V\u000f¹\n\u009c\tçYÊ\u001b-\u001903\u001be~\nA\u0005¤\u0016\u008f\u001e\u0092ÆõóØÁ#Ö\u0006Á\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0091ñ¯Ö§»ª Ú\u0085ÈjùOÙ4Ø\u0019ÒþÄãòÈò\u00adà\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u009añ Ö½»¡ Í\u0085ÉjÁOÙ4ß\u0019ÏþÀãðÈÛ\u00adû\u0092þwü\\æA\u0010&\u001c\u000b\u0006m\u0001\u0089Ó¤ÍÃÙþÍ\u0015ú0Ã/ñJìaÌ\u009cæ»óÖèÍ\u0080è\u0093\u0007\u009d\"\u0099Y°t\u0082\u0093\u0088\u008e´¥µÀ\u009eÿµ\u001a±1¡,^KUfM\u009dK¸D×dòDée\u0004o#y^ouo\u0090}\u009f\u0006{ÔVÊ1Þ\fÊçýÂÄÝö¸ë\u0093ËnáIô$ï?\u0087\u001a\u0094õ\u009aÐ\u009e«·\u0086\u0085a\u008f|³W²2\u0094\r®è±Ã½ÞQ¹]\u0094[oW\u008b\noØBÆ%Ò\u0018ÆóñÖÈÉú¬ç\u0087Çzí]ø0ã+\u008b\u000e\u0098á\u0096Ä\u0092¿»\u0092\u0089u\u0083h¿C¾&\u0099\u0019ªü ×°ÊY\u00adS\u0080~{@^_1W\u0014C\u000fsâuÅetÙ\u0090\u0007½'Ú\u0007ç\u0012\f\u0010P\u0012´À\u0099ÞþÊÃÞ(é\rÐ\u0012âwÿ\\Ã¡ñ\u0086ãëóð\u0097Õ\u0081:ª\u001f\u008a\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u0094\f²ñ·Ö¦»± Ë\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u009dñ¯Ö½»\u00ad É\u0085ßjôOÔ4ç\u0019ÏþÒãèÈò\u00adü\u0092èwúà\u0001\u0004Ó)ÍNÙsÍ\u0098ú½Ã¢ñÇììÓ\u0011æ6à[à@\u0093e¡\u008a\u0091¯\u0098Ô\u0091\u001cöø(Õ ²6\u008f/d5A'^$;\u000e\u0010\u0010í\u0010Ê\b§\u0016¼I\u0099ivFSf(h\u0005p\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u008e\fºñ«Ö¾»\u008c Ð\u0085ÖjÑOÕ4Ù\u0006\u0013âÏÏØ¨Î\u0095Ä~Ó[ÙDë!Ì\nè÷àÐú½è¦\u0080\u0083¡l\u008bI¦2\u0098\u001f\u008fø\u008få£Î£«\u00ad\u0094¥\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u0099\f·ñ¯Ö¹»° Ú\u0085ÈjüOÞ4ß\u0019ÃþÓãúÈö\u00adñ\u0092è\u001a þôÓì´ö\u0089ôbìGÍX×=ò\u0016ÜëÔÌÆ¡ãº¿\u009f p¾U¬.£\u0003©ä¬ù\u0097\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u0091\f½ñºÖ¬»¶ Þ\u0085ÙjÁOÙ4Ä\u0019ÈþíãõÈä\u00adæ\u0092èwæ\\æA\fl\u0096\u0088B¥ZÂ@ÿB\u0014Z1{.aKI`e\u009dbºt×nÌ\u0001é\u0003\u0006\u000e#\r§íC9n!\t;49ß!ú\u0000å\u001a\u00807«\u001fV\fq\u000e\u001c+\u0007u\"jÍbèv\u0093f¾`Yp\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u008b\f¾ñ¯Öº»¬ ó\u0085ÓjÆOÄ4Î\u0019ÈþÄãî\u0000Nä\u009aÉ\u0082®\u0098\u0093\u009ax\u0082]£B¹'\u008e\fºñ«Ö¾»\u0086 Ö\u0085ÔjÑOÕ4Ù\u0019ïþÏãèÈò\u00adà\u0092ëwé\\àA\u001b6nÒ°ÿ\u009d\u0098¿¥·N©\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0092ñªÖ\u0080»ª Ù\u0085ÕÞf:´\u0017ªp¾Mª¦\u009d\u0083¤\u009c\u0096ù\u008bÒ»/\u0085\b\u008de\u0080~ð[â´Þ\u0091þê×Çå î=Á\u0000cä\u0094É\u009b®ß\u0093\u0099x\u0089]\u008bB©'¡\fàñªÖç»© Ú\u0085ÞjÜOÑ4ß\u0019ÏþÎãòÈ¹\u00adð\u0092ìwæ\\íA\u001b&\u000b\u000bZð#Õ\u000fº\u0013\u009f\u0005\u00847i\u0006N=3-\u0018>ý\u0000â\\ÇV¬]\u0091Kv[[e@{%L\n|ïuÔ|\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0091ñ¯Ö§»ª Ú\u0085ÈjôOÔ4ý\u0019ÏþÄãëÈÛ\u00adû\u0092þwü\\æA\u0010&\u001c\u000b\u0006\u0000Iä\u0089É\u0099®\u009f\u0093¿x\u0088]\u0097B¯'»\f¶ñ\u008fÖ\u00ad»· ù\u0085ÕjÇOÝ4Ê\u0019Ò39×áúã\u009dä òKînØqÂ\u0014ê?ÆÂÓåÝ°éT1y3\u001e4#\"È>í\bò\u0012\u0097!¼\u001dA\u0014f\u0017\u000b\n\u0010g5e\u0000Bä\u009aÉ\u0098®\u009f\u0093\u0089x\u0095]£B¹'\u008e\fºñ«Ö¾\u0000cä\u0094É\u009b®ß\u0093\u0099x\u0089]\u008bB©'¡\fàñªÖç»\u00ad Í\u0085ÕjÛOÃ4Ä\u0019ÓþÓãÿÈò\u00adó\u0092éwû\\\u00adA\u001c&\u0018\u000b\u001að\u0001Õ\u000fº\u0017\u009fN\u0084\u0019i7N?3\"\u0018\"ý0â|Ç\\¬e\u0091GvL[S\u001a:þâÓà´ç\u0089ñbíGÛXÁ=ö\u0016ÂëÓÌÆ¡ðº®\u009f±p¹U\u00ad.½\u0003»ä«\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0085ójÛOÖ4Ä\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0085öjÜOÃ4ß\u0019ÃþÏãùÈå\u0000Iä\u0095É\u0082®\u0094\u0093\u009ex\u0094]\u0096B´'¬\fºñ¯Ö¥»\u0085 Û\u0085èjÐOÁ4Þ\u0019ÃþÒãè\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·ñ\u0087Ö§»¢ Ð\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·ñ\u0082Ö »· Ë\u0085ßjÛOÕ4Ù\u0000Rä\u009eÉ\u0081®\u0090\u0093\u009ex\u0083]\u0087B¹'\u0099\f·ñ\u009cÖ¬»µ Ê\u0085ßjÆOÄ±'Uõxë\u001fÿ\"ëÉÜìåó×\u0096Ê½ñ@ËgÖ\nÊ\u0011¦4¢Ûªþ²\u0085´¨¤O«R\u009by½\u001c\u009d\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u009añ Ö½»¡ Í\u0085ÉjÁOÙ4ß\u0019ÏþÀãðÈÖ\u00adö\u0092Áwá\\ðA\n&\u001c\u000b\u001að\nÕ\u0018\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0081ñ«Ö¾»¥ Í\u0085ÞjÐOÔ4ê\u0019Â\u0000Lä\u009eÉ\u0080®\u0094\u0093\u0080x·]\u008eB¼'¡\f\u0081ñ«Ö¾»¥ Í\u0085ÞjÐOÔ4ê\u0019ÂþíãõÈä\u00adæ\u0092èwæ\\æA\fÓ\u00967D\u001aZ}N@Z«m\u008eT\u0091fô{ß[\"q\u0005dh\u007fs\u0017V\u0004m\u0091\u0089h¤tÃWþv\u0015p0w/NJCa@\u009cV»KÖ|Í(è!\u0007&\u0000gä\u009eÉ\u0082®³\u0093\u008dx\u0089]\u008cB¸'ª\f\u009fñ¯Ö°»« Ê\u0085ÎjåOÜ4Ê\u0019ÅþÄãñÈò\u00adü\u0092ùwÆ\\âA\u0013&\u001c±7UÎxÒ\u001fè\"ÑÉÇìÀóè\u0096û½ð@÷gö\nú\u0011«4\u008bÛ\u0091þ\u0081\u0085±¨\u0085O\u009eR¢¾ÜZ\"w/\u0010\u0005-<Æ*ã-ü\u0005\u0099\u0016²\u001dO\u001ah\u001b\u0005\u0017\u001eF;fÔ|ñl\u008aZ§r@o]UvO\u0013A,UÉG\u0005Zá¶Ì³«¶\u0096²}ªX\u0083G\u0098\"\u0080\t\u0089ô\u0083Ó\u0092¾\u009f¥þ\u0080ýoóJÜ1â\u001cúûèæøÍÖ¨É\u0097ÑrÅYÅD3##gÚ\u00837®+É\u0016ô$\u001f::\"%\u0002@\u0014k;\u0096\u0003±,Ü\u0004Çeâg\ry(wSg~}¢MF´k¨\f\u00881£Ú¿ÿ¾à\u0092\u0085\u0080®½S\u0085t\u0097\u0019\u008f".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, InterfaceC3018cs.a.f7816h);
        f5422 = cArr;
        f5421 = 3792223598373692667L;
    }

    public C2691bv(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5879(ImpressionDataListener impressionDataListener) {
        f5420 = (f5419 + 75) % 128;
        m5893(impressionDataListener);
        f5420 = (f5419 + 27) % 128;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5880(AdData adData) {
        f5420 = (f5419 + 91) % 128;
        String strM5887 = m5887(adData);
        int i = f5420 + 77;
        f5419 = i % 128;
        if (i % 2 == 0) {
            return strM5887;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5884(IronSourceBannerLayout ironSourceBannerLayout) {
        int i = f5419 + 115;
        f5420 = i % 128;
        if (i % 2 != 0) {
            return m5891(ironSourceBannerLayout);
        }
        m5891(ironSourceBannerLayout);
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5890(ImpressionDataListener impressionDataListener) {
        f5419 = (f5420 + 45) % 128;
        m5886(impressionDataListener);
        f5420 = (f5419 + 119) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5892(Placement placement) {
        int i = f5420 + 75;
        f5419 = i % 128;
        int i2 = i % 2;
        String strM5885 = m5885(placement);
        if (i2 != 0) {
            int i3 = 90 / 0;
        }
        f5419 = (f5420 + 37) % 128;
        return strM5885;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ JSONObject m5881(ImpressionData impressionData) {
        f5420 = (f5419 + 75) % 128;
        JSONObject jSONObjectM5888 = m5888(impressionData);
        int i = f5419 + 3;
        f5420 = i % 128;
        if (i % 2 != 0) {
            return jSONObjectM5888;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static JSONObject m5888(ImpressionData impressionData) {
        int i = f5420 + InterfaceC3173h3.d.b.f8823f;
        f5419 = i % 128;
        if (i % 2 != 0) {
            impressionData.getAllData();
            throw null;
        }
        JSONObject allData = impressionData.getAllData();
        int i2 = f5420 + 67;
        f5419 = i2 % 128;
        if (i2 % 2 == 0) {
            return allData;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x09c1  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 3038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2691bv.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5420 = (f5419 + 21) % 128;
        String sDKVersion = IronSourceUtils.getSDKVersion();
        f5419 = (f5420 + InterfaceC3173h3.d.b.f8826i) % 128;
        return sDKVersion;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5882(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f5420 = (f5419 + 19) % 128;
        m5889(levelPlayNativeAd, levelPlayNativeAdListener);
        int i = f5419 + 29;
        f5420 = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    /* renamed from: ﾇ */
    private static void m5889(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        f5420 = (f5419 + 17) % 128;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        int i = f5419 + 9;
        f5420 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private static String m5891(IronSourceBannerLayout ironSourceBannerLayout) {
        f5420 = (f5419 + 67) % 128;
        String placementName = ironSourceBannerLayout.getPlacementName();
        f5420 = (f5419 + InterfaceC3173h3.d.b.f8819b) % 128;
        return placementName;
    }

    /* renamed from: ﾇ */
    private static String m5887(AdData adData) {
        int i = f5420 + 35;
        f5419 = i % 128;
        if (i % 2 != 0) {
            adData.getServerData();
            throw null;
        }
        String serverData = adData.getServerData();
        f5420 = (f5419 + 69) % 128;
        return serverData;
    }

    /* renamed from: ﾒ */
    private static void m5893(ImpressionDataListener impressionDataListener) {
        f5419 = (f5420 + 91) % 128;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i = f5420 + 45;
        f5419 = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5883(16 - Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1357, (char) (28150 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2691bv.m5892((Placement) list.get(0));
            }
        });
        map.put(m5883((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 1373 - (KeyEvent.getMaxKeyCode() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2691bv.m5884((IronSourceBannerLayout) list.get(0));
            }
        });
        map.put(m5883(20 - TextUtils.lastIndexOf("", '0', 0, 0), 1402 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 45392)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2691bv.m5881((ImpressionData) list.get(0));
            }
        });
        map.put(m5883((ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, 1470 - AndroidCharacter.getMirror('0'), (char) (48829 - TextUtils.getTrimmedLength(""))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2691bv.m5890((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m5883(TextUtils.getOffsetAfter("", 0) + 28, 1447 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1320 - TextUtils.getOffsetBefore("", 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2691bv.m5879((ImpressionDataListener) list.get(0));
                return null;
            }
        });
        map.put(m5883(18 - ExpandableListView.getPackedPositionChild(0L), 1474 - TextUtils.indexOf((CharSequence) "", '0'), (char) (26538 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2691bv.m5882((LevelPlayNativeAd) list.get(0), (LevelPlayNativeAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5883((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13, 1494 - TextUtils.indexOf("", ""), (char) (41514 - TextUtils.getOffsetAfter("", 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2691bv.m5880((AdData) list.get(0));
            }
        });
        int i = f5420 + 1;
        f5419 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m5885(Placement placement) {
        int i = f5419 + 87;
        f5420 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (placement == null) {
            return null;
        }
        String placementName = placement.getPlacementName();
        f5420 = (f5419 + InterfaceC3173h3.d.b.f8823f) % 128;
        return placementName;
    }

    /* renamed from: ｋ */
    private static void m5886(ImpressionDataListener impressionDataListener) {
        f5419 = (f5420 + 55) % 128;
        IronSource.addImpressionDataListener(impressionDataListener);
        f5419 = (f5420 + 121) % 128;
    }

    /* renamed from: ｋ */
    private static String m5883(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5422[i2 + i3] ^ (i3 * f5421)) ^ c);
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
}
