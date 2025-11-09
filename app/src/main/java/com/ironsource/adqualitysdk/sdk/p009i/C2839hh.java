package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.annotation.RequiresApi;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hh */
/* loaded from: classes2.dex */
public class C2839hh extends WebViewClient implements C2671bb.e, InterfaceC2707ck {

    /* renamed from: ﮐ */
    private static int f6584 = 1;

    /* renamed from: ﻐ */
    private static int f6585;

    /* renamed from: ﻛ */
    private static long f6586;

    /* renamed from: ﾒ */
    private static char[] f6587;

    /* renamed from: ｋ */
    private WebViewClient f6588;

    /* renamed from: ﾇ */
    private WebViewClient f6589;

    static {
        char[] cArr = new char[IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID];
        ByteBuffer.wrap("\u0000Wd\\È\u0010,ý\u0090\u008dõxY!½Ì!¤\u0086hê_N\u001d²Ø\u0016¡{{ß4Cÿ§»\fcpOÔ\u001b8ß\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Þ\u009c\u008e\u0001pe-Éý-®\u0092LöJZ\u0010¾Ü\"\u0095\u0087Ië=O÷³\u009e\u0018v|Qà:DÀ¨\u0089\rEq3Õý9«\u009e-\u0002Kf\u0005ÊÜ.À\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lêuN\u0001²Å\u0016\u0082{wß9CÓ§¥\fkp^Ô\u001a8Ù\u009cÆ\u0001le0Éþ-¿\u0092oöXZ:¾Ø\"\u0082\u0087Rë+Oû³¯\u0018a|hà\u0004DÃ¨¤\rNq;Õ÷9¥\u009ek\u0002Yf_ÊÅ.\u009b\u0093N÷r.©J§æì\u0002(¾zÛÑwÓ\u0093\r\u000f\u0004¨\u0080Ä\u0082`ý\u009c\f8`U\u0081ñÏm\u0019\u0089K\"\u008b^¥ú¸\u00162²b/\u009cKÁç\u0011\u0003B¼ Ø¦tü\u00900\fy©¥ÅÑa\u001b\u009dr6\u009aR½ÎÖj,\u0086e#©_ßû\u0011\u0017G°Á, Hþä-\u0000p½«ÙÄu\f\u0091\b\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lêuN\u0001²Å\u0016\u0082{wß9CÓ§¥\fkp^Ô\u001a8Ù\u009cÆ\u0001le0Éþ-¿\u0092oöXZ:¾Ø\"\u0082\u0087Rë+Oû³¯\u0018a|hà\u0004DÃ¨¤\rNq;Õ÷9¥\u009ek\u0002Yf_ÊÂ.\u008c\u0093S÷.[ñ¿¾$r\u0088\u0016H\u0082,\u008c\u0080Çd\u0003ØQ½ú\u0011øõ&i/Î«¢©\u0006Öú'^K3ª\u0097ä\u000b2ï`D 8\u008e\u009c\u0093p\u0005ÔOI\u0088-þ\u00811ehÚ\u0097¾\u008f\u0012Óö\u001bjTÏ\u0082£ú\u0097\u001aó\u0014__»\u009b\u0007ÉbbÎ`*¾¶·\u00113}1ÙN%¿\u0081Óì2H|Ôª0ø\u009b8ç\u0016C\u000b¯\u009d\u000b×\u0096\u0010òf^©ºð\u0005\u001aa\nÍD)\u0098µË\u0010\u0017|cØ©\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Â\u009c\u0088\u0001Se7Éð-®\u0092QöYZ\u0006¾Á\"\u0092\u0087Rë:O÷\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Þ\u009c\u008e\u0001pe-Éý-®\u0092JöRZ\u0001¾Ë\"\u0095\u0087Cë<Oâ³¿\u0018V|Xà\u0007DÚ¨\u008d\rRq.A\u0012%\u001c\u0089Wm\u0093ÑÁ´j\u0018hü¶`¿Ç;«9\u000fFó·WÛ::\u009et\u0002¢æðM01\u001e\u0095\u0003y\u0095Ýß@\u001c$`\u0088©lÐÓ5·\u0005\u001b[ÿ«cÕÆ\u0013ªg\u000e·òùY0=\u001e¡Rl¸\b¶¤ý@9ük\u0099À5ÂÑ\u001cM\u0015ê\u0091\u0086\u0093\"ìÞ\u001dzq\u0017\u0090³Þ/\bËZ`\u009a\u001c´¸©T?ðum°\tÀ¥\u000fARþ\u0097\u009a·6íÒ7N_ë¯\u0087Ö#\u0000ßDO¼+²\u0087ùc=ßoºÄ\u0016Æò\u0018n\u0011É\u0095¥\u0097\u0001èý\u0019Yu4\u0094\u0090Ú\f\fè^C\u009e?°\u009b\u00adw;ÓqN *Î\u0086\u001ab^Ý¨¹ \u0015ÿñ\"m|È´¤É\u0000\u0018üAW\u00943«¯á\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086nêTN5²Ã\u0016\u0097{sß\u0005Cõ§º\fwpYÔ\u00198Ä\u009c\u0095\u0001le1Éþ-¤N\"*,\u0086gb£Þñ»Z\u0017Xó\u0086o\u008fÈ\u000b¤\t\u0000vü\u0087Xë5\n\u0091D\r\u0092éÀB\u0000>.\u009a3v®ÒîO-+O\u0087\u0092cÌÜ\u0010¸>\u0014Dð lóÉ.¥J\u0001\u0090ýÈV+23®b\n¼æàC4?D\u000fÁkÏÇ\u0084#@\u009f\u0012ú¹V»²e.l\u0089èåêA\u0095½d\u0019\btéÐ§Lq¨#\u0003ã\u007fÍÛÐ7F\u0093\f\u000eÉj¹Æv\"+\u009dîùÎU\u0094±N-0\u0088×ä±@S¼=\u0017òsÖï\u00800§T©øâ\u001c& tÅßiÝ\u008d\u0003\u0011\n¶\u008eÚ\u008c~ó\u0082\u0002&nK\u008fïÁs\u0017\u0097E<\u0085@«ä¶\b ¬j1¯Ußù\u0010\u001dM¢\u0088Æ¨jò\u008e(\u0012F·®ÛÒ\u007f\u0015\u0083G(\u0092L\u009cÐñt?\u0098~=\u0091AÝå\u0000\t[®\u00822¯Vá|\u008a\u0018\u0084´ÏP\u000bìY\u0089ò%ðÁ.]'ú\u00ad\u0096\u00942ÐÎ\u000fjC\u0007¿£ÿ?\u007fÛip¿\f\u009d¨ÜD\u000bàG}ð\u0019øµ0QWî©\u008a\u0090&ßÂ\b^^û\u008a\u0097ò3\u001eÏhd¢\u0000\u0097\u009c×8\u0014Ôdq\u008b\rç©(EQâ¯~\u0080\u001aÍ¶\u001aRUï\u0099)²M¼á÷\u00053¹aÜÊpÈ\u0094\u0016\b\u001f¯\u009bÃ\u0099gæ\u009b\u0017?{R\u009aöÔj\u0002\u008eP%\u0090Y¾ý£\u00115µ\u007f(ºLÊà\u0005\u0004X»\u009dß½sç\u0097=\u000bX®£ÂÚf\u0015\u009a}1\u0086U¾Éém\n\u0081z$§XØü\u0001\u0010H·\u0086õã\u0091í=¦Ùbe0\u0000\u009b¬\u0099HGÔNsÊ\u001fÈ»·GFã*\u008eË*\u0085¶SR\u0001ùÁ\u0085ï!òÍxi(ôÖ\u0090\u008b<[Ø\bgê\u0003ì¯¶Kz×3rï\u001e\u009bºQF&íÇ\u0089â\u0015\u0095±\u007f]+øé\u0084\u0088ÇU£[\u000f\u0010ëÔW\u00862-\u009e/zñæøA|-~\u0089\u0001uðÑ\u009c¼}\u00183\u0084å`·Ëw·Y\u0013DÿÒ[\u0098ÆZ¢&\u000eéê»U}1H\u009d\tyÛå\u0093@{,,\u0088ût\u009eßb»H'\b\u0083Ë\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Â\u009c\u0088\u0001Le;Éð-¦\u0092fö\u007fZ\u001d¾Ï\"\u0089\u0087Gë<Oö\u0000EdKÈ\u0000,Ä\u0090\u0096õ=Y?½á!è\u0086lênN\u0011²à\u0016\u008c{mß#Cõ§§\fgpIÔT8Â\u009c\u0088\u0001Me=Éò-¯\u0092jöJZ\u0010¾Ê\"«\u0087Oë>Oû³¥\u0018V|Xà\u0007DÚ¨\u008d\rRq.6©R§þì\u001a(¦zÃÑoÓ\u008b\r\u0017\u0004°\u0080Ü\u0082xý\u0084\f `M\u0081éÏu\u0019\u0091K:\u008bF¥â¸\u000e.ªd7¡SÑÿ\u001e\u001bC¤\u0086À¦lü\u0088&\u0014C±¸ÝÁy\u000e\u0085b.\u009aJ£Öõr1ûc\u009fm3&×âk°\u000e\u001b¢\u0019FÇÚÎ}J\u0011Hµ7IÆíª\u0080K$\u0005¸Ó\\\u0081÷A\u008bo/rÃäg®úk\u009e\u001b2ÙÖ\u0088i@\rh¡\u0003EúÙ®|e\u0010\u001a´ÇH\u009eãe\u0087t\u001b>¿ì¿¿Û\u0084wÞ\u0093$/NJ¤æþ\u0002'\u009eu9½UµñÎ\r\u0016©kÄ¯`êü?\u0018R³¶Ï\u008akÉ\u0087\u001b#J\u0000gd\\È\u0006,ÿ\u0090\u0086õJY3½í!\u009e\u0086hê_N\u0004²ï\u0016\u0089{wß2Cþ§½".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID);
        f6587 = cArr;
        f6586 = -3310082484054891463L;
    }

    public C2839hh(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f6588 = webViewClient;
        this.f6589 = webViewClient2;
    }

    /* renamed from: ﻛ */
    private boolean m6861() {
        int i = f6584 + 21;
        f6585 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient != null && !webViewClient.getClass().equals(WebViewClient.class)) {
            int i2 = f6585 + 5;
            f6584 = i2 % 128;
            return !(i2 % 2 == 0);
        }
        int i3 = f6585 + 43;
        f6584 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
        return false;
    }

    /* renamed from: ｋ */
    private WebViewClient m6863() {
        int i = (f6584 + 41) % 128;
        f6585 = i;
        WebViewClient webViewClient = this.f6588;
        int i2 = i + InterfaceC3173h3.d.b.f8819b;
        f6584 = i2 % 128;
        if (i2 % 2 != 0) {
            return webViewClient;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private Object m6865() {
        int i = f6584;
        WebViewClient webViewClient = this.f6589;
        f6585 = (i + 69) % 128;
        return webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        int i = f6585 + 3;
        f6584 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(22 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.keyCodeFromString(""), (char) (AndroidCharacter.getMirror('0') - '0')).intern(), m6860(ExpandableListView.getPackedPositionGroup(0L) + 43, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 522, (char) (TextUtils.lastIndexOf("", '0') + 20072)).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6589.doUpdateVisitedHistory(webView, str, z);
            throw null;
        }
        this.f6589.doUpdateVisitedHistory(webView, str, z);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient != null) {
            f6585 = (f6584 + 85) % 128;
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
            f6584 = (f6585 + 41) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        int i = f6584 + 87;
        f6585 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(KeyEvent.normalizeMetaState(0) + 22, TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 1)).intern(), m6860((ViewConfiguration.getWindowTouchSlop() >> 8) + 39, TextUtils.indexOf("", "") + 456, (char) (ExpandableListView.getPackedPositionGroup(0L) + 20473)).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6589.onFormResubmission(webView, message, message2);
            throw null;
        }
        this.f6589.onFormResubmission(webView, message, message2);
        try {
            WebViewClient webViewClient = this.f6588;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
            } else {
                f6585 = (f6584 + 107) % 128;
                webViewClient.onFormResubmission(webView, message, message2);
            }
        } catch (Error e) {
            C2914kb.m7426(m6860((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), m6860(27 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.red(0) + 495, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), (Throwable) e, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        f6585 = (f6584 + 9) % 128;
        try {
            this.f6589.onLoadResource(webView, str);
        } catch (Throwable th) {
            C2914kb.m7426(m6860(21 - MotionEvent.axisFromString(""), View.combineMeasuredStates(0, 0), (char) TextUtils.getTrimmedLength("")).intern(), m6860(34 - MotionEvent.axisFromString(""), 303 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient != null) {
            f6585 = (f6584 + 87) % 128;
            webViewClient.onLoadResource(webView, str);
            return;
        }
        super.onLoadResource(webView, str);
        int i = f6585 + 85;
        f6584 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onPageCommitVisible(WebView webView, String str) {
        int i = f6584 + 71;
        f6585 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern(), m6860(TextUtils.lastIndexOf("", '0', 0, 0) + 35, 234 - TextUtils.indexOf("", "", 0), (char) (Color.blue(0) + 18631)).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6589.onPageCommitVisible(webView, str);
            throw null;
        }
        this.f6589.onPageCommitVisible(webView, str);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onPageCommitVisible(webView, str);
            return;
        }
        int i2 = f6584 + 71;
        f6585 = i2 % 128;
        if (i2 % 2 == 0) {
            webViewClient.onPageCommitVisible(webView, str);
        } else {
            webViewClient.onPageCommitVisible(webView, str);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i = f6585 + 63;
        f6584 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(22 - TextUtils.getCapsMode("", 0, 0), (-1) - TextUtils.lastIndexOf("", '0'), (char) Color.blue(0)).intern(), m6860(35 - View.MeasureSpec.getSize(0), 268 - (Process.myTid() >> 22), (char) (38751 - TextUtils.getCapsMode("", 0, 0))).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6589.onPageFinished(webView, str);
            throw null;
        }
        this.f6589.onPageFinished(webView, str);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onPageFinished(webView, str);
        } else {
            f6585 = (f6584 + 5) % 128;
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        int i = f6585 + 117;
        f6584 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(Process.getGidForName("") + 23, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), m6860(34 - (ViewConfiguration.getFadingEdgeLength() >> 16), 235 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (18631 - Color.blue(0))).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6589.onPageStarted(webView, str, bitmap);
            throw null;
        }
        this.f6589.onPageStarted(webView, str, bitmap);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onPageStarted(webView, str, bitmap);
            return;
        }
        int i2 = f6585 + 113;
        f6584 = i2 % 128;
        if (i2 % 2 != 0) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            webViewClient.onPageStarted(webView, str, bitmap);
            int i3 = 40 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i = f6584 + 67;
        f6585 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(MotionEvent.axisFromString("") + 23, (-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.indexOf("", "", 0, 0)).intern(), m6860((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49, Process.getGidForName("") + IronSourceError.ERROR_BN_LOAD_EXCEPTION, (char) (12514 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6589.onReceivedClientCertRequest(webView, clientCertRequest);
            throw null;
        }
        this.f6589.onReceivedClientCertRequest(webView, clientCertRequest);
        try {
            WebViewClient webViewClient = this.f6588;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                f6584 = (f6585 + 75) % 128;
            }
        } catch (Throwable th2) {
            C2914kb.m7426(m6860(21 - Process.getGidForName(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m6860((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50, TextUtils.getOffsetBefore("", 0) + 652, (char) (Gravity.getAbsoluteGravity(0, 0) + 31951)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = f6584 + 9;
        f6585 = i2 % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(22 - View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m6860(36 - (ViewConfiguration.getWindowTouchSlop() >> 8), 420 - ExpandableListView.getPackedPositionGroup(0L), (char) (27901 - Color.argb(0, 0, 0, 0))).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f6589.onReceivedError(webView, i, str, str2);
            throw null;
        }
        this.f6589.onReceivedError(webView, i, str, str2);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onReceivedError(webView, i, str, str2);
            return;
        }
        int i3 = f6585 + 1;
        f6584 = i3 % 128;
        if (i3 % 2 == 0) {
            webViewClient.onReceivedError(webView, i, str, str2);
            int i4 = 38 / 0;
        } else {
            webViewClient.onReceivedError(webView, i, str, str2);
        }
        int i5 = f6584 + 79;
        f6585 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        int i = f6584 + 75;
        f6585 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), m6860((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46, 703 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 10743)).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6589.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            throw null;
        }
        this.f6589.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        int i2 = f6584 + 119;
        f6585 = i2 % 128;
        if (i2 % 2 == 0) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f6589.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            f6585 = (f6584 + 81) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6860(23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (ImageFormat.getBitsPerPixel(0) + 1)).intern(), m6860(ImageFormat.getBitsPerPixel(0) + 41, (ViewConfiguration.getFadingEdgeLength() >> 16) + 910, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 14060)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            int i = f6584 + 123;
            f6585 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            return;
        }
        int i2 = f6585 + 73;
        f6584 = i2 % 128;
        if (i2 % 2 != 0) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        f6584 = (f6585 + 79) % 128;
        try {
            this.f6589.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            C2914kb.m7426(m6860((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), m6860(43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 867, (char) View.resolveSize(0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            f6585 = (f6584 + 25) % 128;
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i = f6584 + InterfaceC3173h3.d.b.f8823f;
        f6585 = i % 128;
        try {
            if (i % 2 != 0) {
                this.f6589.onReceivedSslError(webView, sslErrorHandler, sslError);
                int i2 = 15 / 0;
            } else {
                this.f6589.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (Throwable th) {
            C2914kb.m7426(m6860(21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1) - ImageFormat.getBitsPerPixel(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), m6860(39 - View.getDefaultSize(0, 0), 565 - KeyEvent.keyCodeFromString(""), (char) (AndroidCharacter.getMirror('0') + 3924)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        int i3 = f6585 + 123;
        f6584 = i3 % 128;
        if (i3 % 2 != 0) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f6585 = (f6584 + 53) % 128;
        try {
            this.f6589.onRenderProcessGone(webView, renderProcessGoneDetail);
            f6585 = (f6584 + 71) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6860(Color.blue(0) + 22, ExpandableListView.getPackedPositionType(0L), (char) Color.blue(0)).intern(), m6860(40 - View.MeasureSpec.makeMeasureSpec(0, 0), 950 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 64295)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            return true;
        }
        f6584 = (f6585 + 35) % 128;
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        int i = f6585 + 47;
        f6584 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f6589.onScaleChanged(webView, f, f2);
                int i2 = 43 / 0;
            } else {
                this.f6589.onScaleChanged(webView, f, f2);
            }
        } catch (Throwable th) {
            C2914kb.m7426(m6860(23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), m6860(35 - (ViewConfiguration.getPressedStateDuration() >> 16), 832 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onScaleChanged(webView, f, f2);
        } else {
            f6585 = (f6584 + 3) % 128;
            webViewClient.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        f6584 = (f6585 + 63) % 128;
        try {
            this.f6589.onTooManyRedirects(webView, message, message2);
        } catch (Throwable th) {
            C2914kb.m7426(m6860(22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) Gravity.getAbsoluteGravity(0, 0)).intern(), m6860((KeyEvent.getMaxKeyCode() >> 16) + 39, 381 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (16727 - View.resolveSize(0, 0))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
            f6585 = (f6584 + 39) % 128;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i = f6585 + InterfaceC3173h3.d.b.f8823f;
        f6584 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860(Color.red(0) + 22, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0)).intern(), m6860(40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 792 - TextUtils.indexOf("", "", 0, 0), (char) (Color.rgb(0, 0, 0) + 16828176)).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6589.onUnhandledKeyEvent(webView, keyEvent);
            throw null;
        }
        this.f6589.onUnhandledKeyEvent(webView, keyEvent);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        int i2 = f6584 + 107;
        f6585 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        int i = f6584 + 95;
        f6585 = i % 128;
        try {
            if (i % 2 != 0) {
                this.f6589.shouldInterceptRequest(webView, str);
                int i2 = 97 / 0;
            } else {
                this.f6589.shouldInterceptRequest(webView, str);
            }
            f6585 = (f6584 + 49) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6860(ExpandableListView.getPackedPositionGroup(0L) + 22, ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) Color.alpha(0)).intern(), m6860(43 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 338 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) Color.green(0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        f6585 = (f6584 + 85) % 128;
        return webViewClient.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f6589.shouldOverrideKeyEvent(webView, keyEvent);
            f6585 = (f6584 + 53) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6860((ViewConfiguration.getPressedStateDuration() >> 16) + 22, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (TextUtils.lastIndexOf("", '0') + 1)).intern(), m6860(43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 750 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (62886 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        f6584 = (f6585 + 31) % 128;
        return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f6584 = (f6585 + 3) % 128;
        boolean zM6862 = m6862(webView, str, false);
        f6584 = (f6585 + 5) % 128;
        return zM6862;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5466(java.lang.String r5, java.util.List<java.lang.Object> r6, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r7) {
        /*
            r4 = this;
            int r6 = r5.hashCode()
            r7 = 368095040(0x15f0af40, float:9.7211724E-26)
            r0 = 0
            r1 = 1
            r2 = 0
            if (r6 == r7) goto L43
            r7 = 381550901(0x16be0135, float:3.0696917E-25)
            if (r6 == r7) goto L12
            goto L71
        L12:
            int r6 = android.view.View.combineMeasuredStates(r2, r2)
            int r6 = 23 - r6
            int r7 = android.view.ViewConfiguration.getTapTimeout()
            int r7 = r7 >> 16
            int r7 = r7 + 990
            float r3 = android.util.TypedValue.complexToFloat(r2)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r3 = 49112(0xbfd8, float:6.882E-41)
            int r3 = r3 - r0
            char r0 = (char) r3
            java.lang.String r6 = m6860(r6, r7, r0)
            java.lang.String r6 = r6.intern()
            boolean r5 = r5.equals(r6)
            if (r5 == r1) goto L3a
            goto L71
        L3a:
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6585
            int r5 = r5 + 75
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6584 = r5
            goto L72
        L43:
            float r6 = android.util.TypedValue.complexToFloat(r2)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            int r6 = r6 + 18
            int r7 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r7 = (byte) r7
            int r7 = r7 + 1014
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r0 = r0 >> 16
            char r0 = (char) r0
            java.lang.String r6 = m6860(r6, r7, r0)
            java.lang.String r6 = r6.intern()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L71
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6584
            int r5 = r5 + 93
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6585 = r5
            r2 = r1
            goto L72
        L71:
            r2 = -1
        L72:
            if (r2 == 0) goto L7d
            if (r2 == r1) goto L78
            r5 = 0
            return r5
        L78:
            java.lang.Object r5 = r4.m6865()
            return r5
        L7d:
            android.webkit.WebViewClient r5 = r4.m6863()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2839hh.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ﻛ */
    private boolean m6862(WebView webView, String str, boolean z) {
        try {
            if (this.f6589.shouldOverrideUrlLoading(webView, str) || z) {
                WebViewClient webViewClient = this.f6588;
                if (webViewClient instanceof C2839hh) {
                    f6584 = (f6585 + 121) % 128;
                    ((C2839hh) webViewClient).m6862(webView, str, true);
                }
                return true;
            }
        } catch (Throwable th) {
            C2914kb.m7426(m6860((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) View.MeasureSpec.getSize(0)).intern(), m6860((ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        if (m6861()) {
            int i = f6585 + 115;
            f6584 = i % 128;
            try {
                if (i % 2 != 0) {
                    return this.f6588.shouldOverrideUrlLoading(webView, str);
                }
                this.f6588.shouldOverrideUrlLoading(webView, str);
                throw null;
            } catch (Throwable th2) {
                C2914kb.m7426(m6860((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22, View.getDefaultSize(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m6860((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, (char) KeyEvent.keyCodeFromString("")).intern(), th2, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r11 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @androidx.annotation.RequiresApi(api = 24)
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6864(android.webkit.WebView r9, android.webkit.WebResourceRequest r10, boolean r11) {
        /*
            r8 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6585
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6584 = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1f
            android.webkit.WebViewClient r0 = r8.f6589     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.shouldOverrideUrlLoading(r9, r10)     // Catch: java.lang.Throwable -> L1d
            r4 = 23
            int r4 = r4 / r3
            r0 = r0 ^ r2
            if (r0 == r2) goto L27
            goto L29
        L1d:
            r11 = move-exception
            goto L3d
        L1f:
            android.webkit.WebViewClient r0 = r8.f6589     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.shouldOverrideUrlLoading(r9, r10)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L29
        L27:
            if (r11 == 0) goto L7a
        L29:
            android.webkit.WebViewClient r11 = r8.f6588     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r11 instanceof com.ironsource.adqualitysdk.sdk.p009i.C2839hh     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L3c
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6584
            int r0 = r0 + 69
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6585 = r0
            com.ironsource.adqualitysdk.sdk.i.hh r11 = (com.ironsource.adqualitysdk.sdk.p009i.C2839hh) r11     // Catch: java.lang.Throwable -> L1d
            r11.m6864(r9, r10, r2)     // Catch: java.lang.Throwable -> L1d
        L3c:
            return r2
        L3d:
            int r0 = android.view.View.MeasureSpec.getSize(r3)
            int r0 = r0 + 22
            int r2 = android.view.KeyEvent.keyCodeFromString(r1)
            int r4 = android.os.Process.myPid()
            int r4 = r4 >> 22
            char r4 = (char) r4
            java.lang.String r0 = m6860(r0, r2, r4)
            java.lang.String r0 = r0.intern()
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r2 = r2 + 53
            int r4 = android.view.Gravity.getAbsoluteGravity(r3, r3)
            int r4 = 124 - r4
            r5 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r1, r5)
            int r5 = 12011 - r5
            char r5 = (char) r5
            java.lang.String r2 = m6860(r2, r4, r5)
            java.lang.String r2 = r2.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r0, r2, r11, r3)
        L7a:
            android.webkit.WebViewClient r11 = r8.f6588
            if (r11 == 0) goto Lc7
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6584
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2839hh.f6585 = r0
            boolean r9 = r11.shouldOverrideUrlLoading(r9, r10)     // Catch: java.lang.Throwable -> L8b
            return r9
        L8b:
            r11 = move-exception
            int r0 = android.text.TextUtils.indexOf(r1, r1, r3)
            int r0 = r0 + 22
            int r1 = android.view.View.resolveSize(r3, r3)
            int r2 = android.view.KeyEvent.getDeadChar(r3, r3)
            char r2 = (char) r2
            java.lang.String r0 = m6860(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 >> 16
            int r1 = 56 - r1
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r2 = 179 - r2
            int r4 = android.graphics.ImageFormat.getBitsPerPixel(r3)
            int r4 = (-1) - r4
            char r4 = (char) r4
            java.lang.String r1 = m6860(r1, r2, r4)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r0, r1, r11, r3)
        Lc7:
            boolean r9 = super.shouldOverrideUrlLoading(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2839hh.m6864(android.webkit.WebView, android.webkit.WebResourceRequest, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        f6585 = (f6584 + 35) % 128;
        boolean zM6864 = m6864(webView, webResourceRequest, false);
        int i = f6584 + 37;
        f6585 = i % 128;
        if (i % 2 == 0) {
            return zM6864;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i = f6584 + 69;
        f6585 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6860((-16777194) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) KeyEvent.keyCodeFromString("")).intern(), m6860(36 - (ViewConfiguration.getTouchSlop() >> 8), 420 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (27901 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6589.onReceivedError(webView, webResourceRequest, webResourceError);
            throw null;
        }
        this.f6589.onReceivedError(webView, webResourceRequest, webResourceError);
        WebViewClient webViewClient = this.f6588;
        if (webViewClient != null) {
            f6584 = (f6585 + 79) % 128;
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            this.f6589.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th) {
            C2914kb.m7426(m6860(TextUtils.lastIndexOf("", '0') + 23, TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m6860(43 - (Process.myTid() >> 22), 338 - ExpandableListView.getPackedPositionGroup(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f6588;
        if (webViewClient == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        f6584 = (f6585 + 93) % 128;
        WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
        int i = f6584 + 91;
        f6585 = i % 128;
        if (i % 2 == 0) {
            return webResourceResponseShouldInterceptRequest;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m6860(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6587[i2 + i3] ^ (i3 * f6586)) ^ c);
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
