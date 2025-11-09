package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.c.f;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.InterfaceC3018cs;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bu */
/* loaded from: classes2.dex */
public final class C2690bu extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static char[] f5400 = null;

    /* renamed from: ﻛ */
    private static long f5401 = 0;

    /* renamed from: ﾇ */
    private static int f5402 = 0;

    /* renamed from: ﾒ */
    private static int f5403 = 1;

    static {
        char[] cArr = new char[1352];
        ByteBuffer.wrap("\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6RR\"n\t\u008aË¦\u00adÃ~ß û\u001e\u0017á3¦PjlA\u0088\u0014¤ýÀ»Ü»ùH\u0015(1äMÈi\u0086\u0086T¢(\u0000c\u001c^8\u000fT½p¢\u008c\u008c©DÅ2áúý\u0097\u0019\u00836uR\"n\u0018\u008aÜ¦¾Ãsß5û\u001b\u0017Õ3±P+lE\u0088\u0003¤óÀçÜ\u009bùH\u0015(1äMÈi\u0086\u0086T¢8¾çÚÀöÊ\u0013\\/(K\u0019gÍ\u0083« k¼XØ\u0018ôô\u0010¸,\u009aIye\u000f\u0081æ\u009d¦¹\u0086ÖKò7\u000eë*úF\u009bcu\u007f<\u009b\u000f·ÈÓ¬ðN\f#(\u0005DË`¥}m\u0099Aµ\u001f\u0098M\u0084[ \bÌòè²\u0014\u00901A]'yåeË\u0081\u008b®YÊ=ö\u0015\u0012Æ>¨[wG7c\u0013\u008fÂ«¾È@ôV\u0010\"<ÿX¹D\u0097aY\u008d1©ýÕÃ\u0000c\u001c^8\u000fT½p¢\u008c\u008c©DÅ2áúý\u0097\u0019\u00836uR\"n\u0018\u008aÜ¦¾Ãsß5û\u001b\u0017Õ3±P+lE\u0088\u0003¤óÀçÜ\u009bùH\u0015(1äMÈi\u0086\u0086T¢8¾çÚÀöÊ\u0013\\/(K\u0019gÍ\u0083« k¼XØ\u0018ôô\u0010¸,\u009aIve\u0014\u0081þ\u009d¯¹\u0087ÖFò$\u000eâ*ÝF\u0087c[\u007f/\u009b=·ÎÓªðf\f6(\u0018DÖ`ª\u0099¬\u0085º¡éÍ\u0013éS\u0015q0 \\Æx\u0004d*\u0080j¯¬ËÀ÷û\u0013#?wZ\u0090FÀbþ\u008e'ªgÉ\u0089õ·\u0011ç=\u0012Y|Es`¯\u008cÀ¨\rÔ)ðK\u001f¦;À'\u000eC oh\u008a\u0084¶ÚÒÑþ\"\u001aN9\u008a\u0000c\u001c^8\u000fT½p¢\u008c\u008c©DÅ2áúý\u0097\u0019\u00836uR\"n\u0018\u008aÜ¦¾Ãsß5û\u001b\u0017Õ3±P+lE\u0088\u0003¤óÀçÜ\u009bùH\u0015(1äMÈi\u0086\u0086T¢8¾çÚÀöÊ\u0013\\/(K\u0019gÍ\u0083« k¼XØ\u0018ôô\u0010¸,\u009aIbe\b\u0081ñ\u009d«¹¹Ö@ò2\u000eî*ÙF¿cs\u007f/\u009b\u0019·ÂÓ\u008eðc\f!(\bDÇ`¡}E\u0099Vµ\u0012Ñþí¾\t\u0090&^B\"^ÏzÒ\u0096\u009c³z\u008aì\u0096ú²©ÞSú\u0013\u00061#àO\u0086kDwj\u0093*¼ÿØ\u008dä\u008b\u0000{,\u0015IÁ\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6ZR(n/\u008aË¦®Ãeß$û\u0001\u0017×\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6ZR(n/\u008aË¦±Ãtß$û\u0000\u0017Æ3¦\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6VR)n\u0019\u008aÇ¦¾Ãdß(û\u001d\u0017Í3\u009aPdl[\u0088\u0002ÅüÙÅý\u0094\u0091Iµ\u001fI&lú\u0000\u0085$p8mÜ1óÏ\u0097\u009e«\u00adOiííñûÕ¨¹R\u009d\u0012a0Dá(\u0087\fE\u0010kô+Ûü¿\u0087\u0083·g~K\u001e.Ú2\u0091\u0016\u0095úhÞ\u001e½Õ\u0081àe¬IP-\u00011;\u0014ýVPJFn\u0015\u0002ï&¯Ú\u008dÿ\\\u0093:·ø«ÖO\u0096`W\u0004;8\rÜÃð\u0085\u0095f\u00896\u00ad\u001fAÈe¢\u0006p:CÞ\u001bòóÃÀßÖû\u0085\u0097\u007f³?O\u001djÌ\u0006ª\"h>FÚ\u0006õÓ\u0091¡\u00ad¢INe3\u0000î\u001c\u009d8\u0095ÔCð)\u0093Ï¯ÐK\u0080ge\u00032\u001f\u001c:ÎÖ¹òa\u008eE\u0004\u0004\u0018\u000e<ZP¶tÑ\u0088Í\u00ad\u0004Ávåµù\u0089\u001dÂ2\u001eVdj\\\u008e\u009a\u008fÐ\u0093Ò·\u0092Ûhÿ%\u0003\u0013&ÿJ«nnrX\u0096\u001a¹àÝ¼á\u009a[ÈX#D5`f\f\u009c(ÜÔþñ/\u009dI¹\u008b¥¥Aån7\nS6{Ò¨þÆ\u009b\u0019\u0087Y£}O¬kÐ\b945Ðiü\u0097\u0098Ì\u0084Ó¡.MXi\u0093\u0015±1ëÞ>úxæ\u0087\u0082·®úK\rwC\u0013q?®ÛÖø\u0012üõàãÄ°¨J\u008c\np(Uù9\u009f\u001d]\u0001så3Êá®\u0085\u0092\u00adv~Z\u0010?Ï#\u008f\u0007«ëzÏ\u0006¬ø\u0090ît\u009eXR<\u0010 (\u0005ãé\u0093Í}±k\u0095 zè^\u0088BP&j\n*V/J!n\u007f\u0002\u008f&ÒÚÏÿ0\u0093@·\u0085«¥Oý`\u0016\u0004y8mÜ¤ðÒ\u0095\f\u0089V\u00adnA¨\u0000I\u001c_8\u0016Töp¶\u008c\u009b©GÅ;áÊýË\u0019\u00856lR?n\u0018\u008aÜ¦\u0093Ãyß2û\u0006\u0017Æ3ºP`lD\u0000T\u001cP8\u0012}&a0Ec)\u0099\rÙñûÔ*¸L\u009c\u008e\u0080 dàK2/V\u0013~÷\u00adÛÃ¾\u001c¢\\\u0086xj©NÕ-+\u0011=õMÙ\u0081½Ã¡û\u00840h@L®0¸\u0014óû;ß[Ã\u0083§¹\u008bùn;RM6y\u001a·þÂÝ\u0000Á&\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6]R9n\u0011\u008aÂ¦¬Ãsß3û\u0017\u0017Æ3ºPPlX\u0088\u000e¤ìÀ\u008aÜ\u0095ùE\u0015(1ÿMÑi\u0083\u0086L¢4¾ð\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6ZR(n+\u008aÇ¦ºÃgß\u0017û\u001b\u0017Ç3±Pjlu\u0088\b¤öÀ½Ü\u009fùE\u0015(1ÎMÑi\u0081\u0086T¢#¾íÚßö\u0088\u0013p/4\u0000E\u001cG8\u0007Týp°\u008c\u0086©jÅ>áûýÍ\u0019\u008f6uR)n\u000f\u008aï¦»Ãqß1û\u0006\u0017Æ3¦\u0000V\u001cX8\u0006Töp«\u008c¶©IÅ9áüýÜ\u0019\u00846oR\u0000n\u0014\u008aÝ¦«Ãuß/û\u0017\u0017Ñ3\u0095PalW\u0088\u0017¤ìÀ¬Ü\u0088\u0000I\u001cp8/Táp¥\u008c\u009c©BÅ\u001cááýÍ\u0000I\u001cp8\u000fTáp¥\u008c\u009c©BÅ\u0000áíýÛ\u0019¼6rR)n\n\u008aí¦°Ã~ß5û\u0000\u0017Ì3¸PilS\u0088\u0015\u0000I\u001cp84Túp \u008c\u0090©IÅ\u001cááýÍ\u0000I\u001c\\8\u0012Táp¡\u008c\u0086©UÅ>áçý×\u0019®6zR8n\u001c\u0000I\u001cp8\u0010Túp§\u008c\u009d©kÅ2áìýÐ\u0019\u008b6MR%n\u0019\u008aË¦°ÃFß(û\u0017\u0017Ô\u0000B\u001cP8\u0011Töp\u0092\u008c\u009c©BÅ2áçýï\u0019\u00836~R;n1\u008aÇ¦¬Ãdß$û\u001c\u0017Æ3¦\u0000I\u001c_8\fTöp¶\u008c\u0094©EÅ#ááýÏ\u0019\u008f6]R9n\u0011\u008aÂ¦¬Ãsß3û\u0017\u0017Æ3ºPDlR\u0088\"¤îÀ¬Ü\u0094ù_\u0015/1ÁM×i\u009c\u0086T¢4¾ìÚÖö\u0096\u0013B//K\u0003gÀ\u0083\u0090 g¼KØ\u001eôø\u0010½,\u008cIYe\u000e\u0081ü\u009d\u0087¹\u0095ÖQò7(Ä4Ò\u0010\u0081|{X;¤\u0019\u0081Èí®ÉlÕB1\u0002\u001e×z¥F¦¢J\u008e7ëê÷\u0089Ó\u0089?K\u001b7xüDÈ ¦\u008c|è7ô\u0003ÑÃ=¿\u0019eeAA5®Ä\u008a¨\u0096gòwÞ\u0004;è\u0007¹c\u009fOV«'\u0088î\u0094Ùð\u008fÜT8\"\u0004\u0006aÜ\u0000g\u001cT8\u0016TÐp±\u008c\u0087©TÅ2áæýÍ\u0019º6iR#n\u001e\u008aË¦¬Ãcß$û\u0016\u0017ñ3±PtlC\u0088\u0002¤ëÀ½\u0087\u009d\u009b®¿ìÓ:÷N\u000b`.¨Bäf\u0016\u0000g\u001cT8\u0016TÒp \u008c¶©IÅ9áüýÜ\u0019\u00846o\u0000i\u001cB8$Tæp¨\u008c\u0099©UÅ4áúýÜ\u0019\u008f6uR\rn\u0019\u0000i\u001cB84Túp \u008c\u0090©IÅ\u0016áì:]&n\u0002,nêJ\u0092¶¦\u0093\u007fÿ\u0006ÛæÇë#¢\fNh\u0003T °ü\u009c°ùXå\u0017\u0000g\u001cT8\u0016Tßp¥\u008c\u008c©IÅ\"áü\u0000g\u001cT8\u0016TÀp¡\u008c\u0099©CÅ4áüýÜ\u0019\u008e6NR\"n\u0014\u008aÚ¦\u009cÃ\u007fß/û\u0006\u0017Ñ3»PilZ\u0088\u0002¤ê\u0000g\u001cT8\u0016TÀp¡\u008c\u0099©CÅ4áüýÜ\u0019\u008e6XR#n\u0013\u008aÚ¦ºÃ~ß5û1\u0017Ì3ºPqlD\u0088\b¤ôÀ¥Ü\u009fùY\u0000g\u001cT8\u0016TÖp²\u008c\u0090©HÅ#áûýõ\u0019\u00836hR8n\u0018\u008aÀ¦ºÃb©sµT\u0091\u0016ýÖÙ²%\u0090\u0000Hl#HûTõ°\u0083\u009fhû8Ç\u0018#À\u000fºjb\u0000g\u001cT8\u0016TÒp \u008c¦©VÅ8áü\u0000g\u001cT8\u0016TÆpª\u008c\u009c©RÅ\u0013ááýÊ\u0019\u009a6wR-n\u0004\u008aú¦¦Ã`ß$û7\u0017Í3¡Ph\u0000g\u001cT8\u0016TÞp¶\u008c\u0094©OÅ3áÊýØ\u0019\u00846uR)n\u000f\u008aø¦¶Ãuß6û;\u0017Ç\u0000g\u001cT8\u0016TÚp©\u008c\u0085©TÅ2áûýÊ\u0019\u00836tR\"n9\u008aÏ¦«Ãqß\u0005û\u001d\u0017Î3µPllX\u0000I\u001c\u007f86TÖp\u0096\u008c¦©rÅ\u001eáÜýð\u0019«6W\u0000L\u001cp8,T×p\u0097\u008c¶©gÅ\u0007áÍ\u009fI\u0083g§#ËÔï\u0094\u0000B\u001cp8,TÝp\u0081\u008c§ÉöÕÐñ\u0091\u009dv¹2E\u0015`Ç\f·\u0000S\u001c`87TÒp\u0096\u008c°\u0000V\u001ct80TÇp\u008d\u008c¶©gÅ\u001b\u0000D\u001ct8$TÒp\u0091\u008c¹©r".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1352);
        f5400 = cArr;
        f5401 = -5382659218389394383L;
    }

    public C2690bu(String str) {
        super(str);
    }

    /* renamed from: ﭸ */
    private static InneractiveUnitController m5848(InneractiveAdSpot inneractiveAdSpot) {
        f5402 = (f5403 + 81) % 128;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        int i = f5402 + 53;
        f5403 = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
        return selectedUnitController;
    }

    /* renamed from: ﮉ */
    private static String m5849(InneractiveAdSpot inneractiveAdSpot) {
        f5403 = (f5402 + 23) % 128;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        int i = f5403 + 65;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return clickThroughUrl;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    private static boolean m5851(InneractiveAdSpot inneractiveAdSpot) {
        f5403 = (f5402 + 5) % 128;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i = f5402 + 15;
        f5403 = i % 128;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
        return zIsVideoAd;
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ InneractiveUnitController m5852(InneractiveAdSpot inneractiveAdSpot) {
        int i = f5403 + 61;
        f5402 = i % 128;
        if (i % 2 != 0) {
            m5848(inneractiveAdSpot);
            throw null;
        }
        InneractiveUnitController inneractiveUnitControllerM5848 = m5848(inneractiveAdSpot);
        f5403 = (f5402 + 125) % 128;
        return inneractiveUnitControllerM5848;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ int m5853() {
        int i = f5402 + 63;
        f5403 = i % 128;
        if (i % 2 != 0) {
            return m5850();
        }
        m5850();
        throw null;
    }

    /* renamed from: ﺙ */
    private static Object m5855(InneractiveAdSpot inneractiveAdSpot) {
        f5402 = (f5403 + 63) % 128;
        f adContent = inneractiveAdSpot.getAdContent();
        int i = f5402 + 51;
        f5403 = i % 128;
        if (i % 2 != 0) {
            return adContent;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private static InneractiveAdRequest m5856(InneractiveAdSpot inneractiveAdSpot) {
        f5403 = (f5402 + 31) % 128;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        f5403 = (f5402 + 29) % 128;
        return currentProcessedRequest;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ InneractiveAdSpot m5858(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = f5403 + InterfaceC3173h3.d.b.f8823f;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return m5866(inneractiveAdViewUnitController);
        }
        m5866(inneractiveAdViewUnitController);
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ boolean m5864(InneractiveAdSpot inneractiveAdSpot) {
        f5402 = (f5403 + 69) % 128;
        boolean zM5854 = m5854(inneractiveAdSpot);
        f5403 = (f5402 + 95) % 128;
        return zM5854;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ InneractiveAdRequest m5865(InneractiveAdSpot inneractiveAdSpot) {
        int i = f5403 + 73;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return m5856(inneractiveAdSpot);
        }
        m5856(inneractiveAdSpot);
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ InneractiveContentController.EventsListener m5868(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f5402 = (f5403 + 39) % 128;
        InneractiveContentController.EventsListener eventsListenerM5873 = m5873(inneractiveFullscreenVideoContentController);
        f5402 = (f5403 + 29) % 128;
        return eventsListenerM5873;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ Object m5874(InneractiveAdSpot inneractiveAdSpot) {
        int i = f5402 + 51;
        f5403 = i % 128;
        if (i % 2 == 0) {
            m5855(inneractiveAdSpot);
            throw null;
        }
        Object objM5855 = m5855(inneractiveAdSpot);
        int i2 = f5402 + 61;
        f5403 = i2 % 128;
        if (i2 % 2 != 0) {
            return objM5855;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    private static int m5850() {
        f5403 = (f5402 + 53) % 128;
        int i = R.id.inneractive_webview_mraid;
        int i2 = f5403 + 61;
        f5402 = i2 % 128;
        if (i2 % 2 == 0) {
            return i;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private static boolean m5854(InneractiveAdSpot inneractiveAdSpot) {
        f5402 = (f5403 + 23) % 128;
        boolean zIsFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        f5403 = (f5402 + 65) % 128;
        return zIsFullscreenAd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* renamed from: ﻏ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Enum m5857(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2690bu.m5857(java.lang.String):java.lang.Enum");
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Object m5859(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i = f5403 + 39;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return m5863(inneractiveFullscreenAdActivity);
        }
        m5863(inneractiveFullscreenAdActivity);
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5867(ImpressionData impressionData) {
        int i = f5403 + 87;
        f5402 = i % 128;
        if (i % 2 != 0) {
            m5860(impressionData);
            throw null;
        }
        String strM5860 = m5860(impressionData);
        f5403 = (f5402 + InterfaceC3173h3.d.b.f8819b) % 128;
        return strM5860;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Enum m5869(String str) {
        f5403 = (f5402 + 11) % 128;
        Enum enumM5857 = m5857(str);
        int i = f5402 + 123;
        f5403 = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
        return enumM5857;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5877(InneractiveAdRequest inneractiveAdRequest) {
        int i = f5403 + 55;
        f5402 = i % 128;
        int i2 = i % 2;
        String strM5871 = m5871(inneractiveAdRequest);
        if (i2 != 0) {
            int i3 = 4 / 0;
        }
        int i4 = f5403 + 9;
        f5402 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM5871;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5876(26 - (ViewConfiguration.getEdgeSlop() >> 16), 1033 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5865((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5876(ExpandableListView.getPackedPositionChild(0L) + 10, 1059 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34810)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5877((InneractiveAdRequest) list.get(0));
            }
        });
        map.put(m5876((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 1068 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5874((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5876(13 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1081, (char) Color.green(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2690bu.m5864((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m5876(View.combineMeasuredStates(0, 0) + 9, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1095, (char) KeyEvent.normalizeMetaState(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2690bu.m5862((InneractiveAdSpot) list.get(0)));
            }
        });
        map.put(m5876(TextUtils.indexOf("", "") + 18, 1104 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (14905 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5872((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5876(AndroidCharacter.getMirror('0') - '\'', 1121 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.12
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5859((InneractiveFullscreenAdActivity) list.get(0));
            }
        });
        map.put(m5876(25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 1130, (char) Color.blue(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5852((InneractiveAdSpot) list.get(0));
            }
        });
        map.put(m5876(28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1156, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5870((InneractiveUnitController) list.get(0));
            }
        });
        map.put(m5876((ViewConfiguration.getFadingEdgeLength() >> 16) + 17, 1182 - Process.getGidForName(""), (char) (Process.myTid() >> 22)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5868((InneractiveFullscreenVideoContentController) list.get(0));
            }
        });
        map.put(m5876(TextUtils.indexOf("", "", 0) + 17, TextUtils.indexOf("", "", 0, 0) + InterfaceC3018cs.c.f7824d, (char) (43264 - TextUtils.indexOf("", ""))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2690bu.m5861((InneractiveContentController) list.get(0), (InneractiveContentController.EventsListener) list.get(1));
                return null;
            }
        });
        map.put(m5876(9 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 1217, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5858((InneractiveAdViewUnitController) list.get(0));
            }
        });
        map.put(m5876(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1225 - Process.getGidForName(""), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5869((String) list.get(0));
            }
        });
        map.put(m5876(20 - (KeyEvent.getMaxKeyCode() >> 16), 1248 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Integer.valueOf(C2690bu.m5853());
            }
        });
        map.put(m5876(22 - ExpandableListView.getPackedPositionChild(0L), AndroidCharacter.getMirror('0') + 1220, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2690bu.m5867((ImpressionData) list.get(0));
            }
        });
        int i = f5403 + 59;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5861(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i = f5402 + 43;
        f5403 = i % 128;
        int i2 = i % 2;
        m5878(inneractiveContentController, eventsListener);
        if (i2 == 0) {
            int i3 = 61 / 0;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Object m5870(InneractiveUnitController inneractiveUnitController) {
        int i = f5403 + 13;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return m5875(inneractiveUnitController);
        }
        m5875(inneractiveUnitController);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2690bu.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5403 + 69;
        f5402 = i % 128;
        if (i % 2 != 0) {
            InneractiveAdManager.getVersion();
            throw null;
        }
        String version = InneractiveAdManager.getVersion();
        int i2 = f5403 + 89;
        f5402 = i2 % 128;
        if (i2 % 2 == 0) {
            return version;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ boolean m5862(InneractiveAdSpot inneractiveAdSpot) {
        f5403 = (f5402 + 79) % 128;
        boolean zM5851 = m5851(inneractiveAdSpot);
        int i = f5402 + 71;
        f5403 = i % 128;
        if (i % 2 != 0) {
            return zM5851;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5872(InneractiveAdSpot inneractiveAdSpot) {
        f5402 = (f5403 + 85) % 128;
        String strM5849 = m5849(inneractiveAdSpot);
        f5403 = (f5402 + 27) % 128;
        return strM5849;
    }

    /* renamed from: ﾒ */
    private static Object m5875(InneractiveUnitController inneractiveUnitController) {
        f5403 = (f5402 + InterfaceC3173h3.d.b.f8821d) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        f5403 = (f5402 + 61) % 128;
        return selectedContentController;
    }

    /* renamed from: ﻐ */
    private static String m5860(ImpressionData impressionData) {
        f5403 = (f5402 + 125) % 128;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i = f5403 + 81;
        f5402 = i % 128;
        if (i % 2 == 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5871(InneractiveAdRequest inneractiveAdRequest) {
        int i = f5402 + 47;
        f5403 = i % 128;
        int i2 = i % 2;
        String spotId = inneractiveAdRequest.getSpotId();
        if (i2 == 0) {
            int i3 = 46 / 0;
        }
        int i4 = f5402 + 45;
        f5403 = i4 % 128;
        if (i4 % 2 != 0) {
            return spotId;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static InneractiveContentController.EventsListener m5873(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f5402 = (f5403 + InterfaceC3173h3.d.b.f8819b) % 128;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        int i = f5402 + 67;
        f5403 = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
        return eventsListener;
    }

    /* renamed from: ﾒ */
    private static void m5878(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        f5403 = (f5402 + 5) % 128;
        inneractiveContentController.setEventsListener(eventsListener);
        f5402 = (f5403 + 31) % 128;
    }

    /* renamed from: ﾒ */
    private static String m5876(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5400[i2 + i3] ^ (i3 * f5401)) ^ c);
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

    /* renamed from: ﻛ */
    private static Object m5863(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i = f5402 + 11;
        f5403 = i % 128;
        int i2 = i % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (i2 == 0) {
            int i3 = 25 / 0;
        }
        f5402 = (f5403 + 43) % 128;
        return layout;
    }

    /* renamed from: ｋ */
    private static InneractiveAdSpot m5866(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        int i = f5403 + 7;
        f5402 = i % 128;
        int i2 = i % 2;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        if (i2 != 0) {
            int i3 = 45 / 0;
        }
        int i4 = f5403 + 87;
        f5402 = i4 % 128;
        if (i4 % 2 == 0) {
            return adSpot;
        }
        throw null;
    }
}
