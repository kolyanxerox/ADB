package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb;
import java.nio.ByteBuffer;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hl */
/* loaded from: classes2.dex */
public class C2843hl extends WebChromeClient implements C2671bb.e, InterfaceC2707ck {

    /* renamed from: ﱟ */
    private static int f6612 = 1;

    /* renamed from: ｋ */
    private static int f6613;

    /* renamed from: ﾇ */
    private static long f6614;

    /* renamed from: ﾒ */
    private static char[] f6615;

    /* renamed from: ﻐ */
    private WebChromeClient f6616;

    /* renamed from: ﻛ */
    private WebChromeClient f6617;

    static {
        char[] cArr = new char[1100];
        ByteBuffer.wrap("\u0006/\u001e\u00116\u0002N\u001ff ~6\u0096_®AÆ}ÞWöl\u000e\u0095&\u008d>\u008aV¤n\u0088\u0086Ý\u009e×¶ÏÎîæéþð\u0017\u001f/\u001ex\u008c`·H£0\u0082\u0018\u008b\u0000ÕèèÐó¸\u0089 È\u0088åp/X\u0015@<(\u0012\u0010\tølàkÈt°_\u0098\u0019\u0080Zi¯Q\u008d9\u009b!\u008a\t\u0096ñÿÙüÁæ©Ò\u0091þy!a$I?1\n\u0019\u001c\u0001\u0011oîwÕ_Á'à\u000fé\u0017·ÿ\u008aÇ\u0091¯ë·ª\u009f\u0087gMOwW^?p\u0007kï\u000e÷\tß\u0016§=\u008f{\u00978~ÍFí.î6ä\u001eöæ\u0086Î\u008dÖ\u0092¾§\u0086\u008bnBvS^_&j\b\u0085\u0010¾8ª@\u008bh\u0082pÜ\u0098á úÈ\u0080ÐÁøì\u0000&(\u001c05X\u001b`\u0000\u0088e\u0090b¸}ÀVè\u0010ðS\u0019¦!\u0086I\u0085Q\u008fy\u009d\u0081í©æ±ùÙÌáý\t#\u0011#96ôKìpÄd¼E\u0094L\u008c\u0012d/\\44N,\u000f\u0004\"üèÔÒÌû¤Õ\u009cÎt«l¬D³<\u0098\u0014Þ\f\u009dåhÝHµK\u00adA\u0085S}#U(M7%\u0002\u001d.õáí÷Åõ½Â\u0095÷\u008dÑe©]´5»-\u0090\u0005\u009a\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)GAHYCqO\u0089\u0007¡%¹/Ñ\u001cé\u001b\u0001í\u0019Ú1ñIÁaÇr¸j\u0083B\u0097:¶\u0012¿\náâÜÚÇ²½ªü\u0082Ñz\u001bR!J\b\"&\u001a=òXê_Â@ºk\u0092-\u008anc\u009b[¡3´+µ\u0003 ûúÓØËÒ£á\u009bæs\u0010k'C\f;<\u0013:\u00159\r\u0002%\u0016]7u>m`\u0085]½FÕ<Í}åP\u001d\u009a5 -\u0089E§}¼\u0095Ù\u008dÞ¥ÁÝêõ¬íï\u0004\u001a<+T.L5d%\u009cL´I¬wÄ}üf\u0014\u0098\f\u009f$\u0093wcoXGL?m\u0017d\u000f:ç\u0007ß\u001c·f¯'\u0087\n\u007fÀWúOÓ'ý\u001fæ÷\u0083ï\u0084Ç\u009b¿°\u0097ö\u008fµf@^`6c.{\u0006kþ\u0007Ö\u0005Î\u000e¦\b\u009e=vÅnßFÍmªu\u0091]\u0085%¤\r\u00ad\u0015óýÎÅÕ\u00ad¯µî\u009dÃe\tM3U\u001a=4\u0005/íJõMÝR¥y\u008d?\u0095||\u0089D¸,£4¬\u001c¤äÎÌèÔÚ¼é\u0084ÿl\u0000t\u0014\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)^ASYmqT\u0089!¡\"¹(×\u0005Ï>ç*\u009f\u000b·\u0002¯\\Ga\u007fz\u0017\u0000\u000fA'lß¦÷\u009cïµ\u0087\u009b¿\u0080WåOâgý\u001fÖ7\u0090/ÓÆ&þ\u001e\u0096\u0013\u008e/¦\u0017^jvvnu\u0006Z>Y\u0013´\u000b\u008f#\u009b[ºs³kí\u0083Ð»ËÓ±ËðãÝ\u001b\u00173-+\u0004C*{1\u0093T\u008bS£LÛgó!ëb\u0002\u0097:¯R¢J\u008db»\u009aÚ²ÌªÝÂí\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)^ASYnq]\u0089\"¡?¹.Ñ\ré!\u0001î\u0019à1÷IÅaÔ\u000b*\u0013\u0011;\u0005C$k-ss\u009bN£UË/ÓnûC\u0003\u0089+³3\u009a[´c¯\u008bÊ\u0093Í»ÒÃùë¿óü\u001a\t\">J7R z2\u0082Nª[²VÚcâ_\n\u008e\u0012\u0097:\u0096B©j¾r \u009aÂ¢êÊúÒìúã\u0001\n\u008e\u000e\u00965¾!Æ\u0000î\töW\u001ej&qN\u000bVJ~g\u0086\u00ad®\u0097¶¾Þ\u0090æ\u008b\u000eî\u0016é>öFÝn\u009bvØ\u009f-§\u0018Ï\u000e×\bÿ\u001f\u0007`/x7v_WgV\u008f¤\u0097©¿\u0083Ç\u008aï\u0089÷\u009a\u001fê'ìOØWÎ\u007fÜ\u0084!¬(´\u0004Ü\u000bä\u0010\f|\u0014W<aD@lVtG\u009c·\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)SAEYCqT\u0089+¡3¹=Ñ\u001cé\u001d\u0001ï\u0019â1ÈIÁaÂyÑ\u0091¡©§Á\u0093Ù\u0085ñ\u0097\nj\"c:TRAjP\u0082%\u009a\u001c²*Ê\u000bâ\u001dú\f\u0012ü\u0000Z\u0018a0uHT`]x\u0003\u0090>¨%À_Ø\u001eð3\bù Ã8êPÄhß\u0080º\u0098½°¢È\u0089àÏø\u008c\u0011y)[AZYAqJ\u00892¡<¹0Ñ\u001eé\u0004\u0001ñ\u0019Á1âIÊaÚyÆ\u0091¤©¿\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u000fð\u0019\bè ü8õPÆhÓ\u0080à\u0098£°ªÈ\u008dà\u0097ø\u0095\u0011f)4AOYBqh\u0089!¡\"¹1Ñ\u0001é\u0007\u0001ó\u0019å1÷IÊaâyÙ\u0091¹©¡Á\u0085Ù\u009fñ\u008c\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)DAEY^qU\u0089-¡#¹/Ñ\u0001é\u001b\u0001î\u0019Þ1ýIÕaÅyÙ\u0091»© Á£Ù\u008dñ\u0096\ng\"u:pRMjP\u0099¨\u0081\u0093©\u0087Ñ¦ù¯áñ\tÌ1×Y\u00adAâiô\u0091\u0005¹\u0011¡\u0018É+ñ>\u0019\r\u0001N)GQ`yzax\u0088\u008b°ÙØ¢À¯è\u0085\u0010Ì8Ï ÜHìpê\u0098\u001e\u0080\b¨\u001aÐ'ø\u000fà4\bT0LXh@rha\u0093ª»\u009c£\u009fË¦ó¼\u001bÁ\u0003Ä+Ñ\u0006g\u001e\\6HNif`~>\u0096\u0003®\u0018ÆbÞ#ö\u000e\u000eÄ&þ>×Vùnâ\u0086\u0087\u009e\u0080¶\u009fÎ´æòþ±\u0017D/|Gq_Zws\u008f\u000b§\u0017¿\u0011×?ï\"\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)WAOYBqK\u0089+¡<¹9Ñ%é\u0011\u0001ó\u0019ÿ1ùIÃaÕ\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u009b\u0011m)`AdYIq^\u0089%¡%¹0Ñ\u001cé\"\u0001é\u0019è1ýIËaàyÓ\u0091»© Á\u0085Ù\u009e\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u009b\u0011m)`AvYEq\\\u0089!¡?¹\u0010Ñ\u0007é\u0015\u0001ä\u0019å1öIÃaàyÎ\u0091§©³Á\u0092Ù\u0089ñ\u008b\nw\"F:uRMjC\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u009b\u0011m)`AvYEqK\u0089-¡$¹9Ñ\fé<\u0001é\u0019ÿ1ìIËaÂyÅ\u0000E\u0018~0jHK`Bx\u001c\u0090!¨:À@Ø\u0001ð,\bæ Ü8õPÛhÀ\u0080¥\u0098¢°½È\u0096àÐø\u0093\u0011f)GAHYCqO\u0089\u0002¡9¹0Ñ\ré7\u0001è\u0019ã1÷I×aÕyÎr1j?B::%\u0012\u0014\n\u000bânÚr²Sª^\u0082yz·R¤J\u0089\"\u0096\u001a\u0090òùê÷Âëºñ\u0092Ê\u008aÃc;[,3\u0002\u0000g\u0018i0lHp`Rxk\u0090-¨6À#Ø\u0004ð\n\bë ý8ùPëhØ\u0080©\u0098©°¶È\u0090".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1100);
        f6615 = cArr;
        f6614 = 8445136619319465996L;
    }

    public C2843hl(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f6616 = webChromeClient;
        this.f6617 = webChromeClient2;
    }

    /* renamed from: ﻐ */
    private WebChromeClient m6872() {
        WebChromeClient webChromeClient;
        int i = f6612 + 89;
        int i2 = i % 128;
        f6613 = i2;
        if (i % 2 != 0) {
            webChromeClient = this.f6616;
            int i3 = 7 / 0;
        } else {
            webChromeClient = this.f6616;
        }
        int i4 = i2 + InterfaceC3173h3.d.b.f8821d;
        f6612 = i4 % 128;
        if (i4 % 2 != 0) {
            return webChromeClient;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6873(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6615[i2 + i3] ^ (i3 * f6614)) ^ c);
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

    /* renamed from: ﾒ */
    private Object m6874() {
        int i = f6612;
        int i2 = i + 9;
        f6613 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        WebChromeClient webChromeClient = this.f6617;
        int i3 = i + 75;
        f6613 = i3 % 128;
        if (i3 % 2 == 0) {
            return webChromeClient;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        f6612 = (f6613 + 11) % 128;
        try {
            this.f6617.getDefaultVideoPoster();
            f6613 = (f6612 + 3) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L), (char) (View.combineMeasuredStates(0, 0) + 1656)).intern(), m6873(43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 889, (char) (Process.myTid() >> 22)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            return super.getDefaultVideoPoster();
        }
        f6613 = (f6612 + 25) % 128;
        return webChromeClient.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        try {
            this.f6617.getVideoLoadingProgressView();
        } catch (Throwable th) {
            C2914kb.m7426(m6873((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, ViewConfiguration.getLongPressTimeout() >> 16, (char) (1656 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), m6873(48 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getTrimmedLength("") + 931, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            f6612 = (f6613 + 119) % 128;
            return webChromeClient.getVideoLoadingProgressView();
        }
        View videoLoadingProgressView = super.getVideoLoadingProgressView();
        f6612 = (f6613 + 63) % 128;
        return videoLoadingProgressView;
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        try {
            this.f6617.getVisitedHistory(valueCallback);
        } catch (Throwable th) {
            C2914kb.m7426(m6873((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (Process.getGidForName("") + 1657)).intern(), m6873(38 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 978, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.getVisitedHistory(valueCallback);
            f6612 = (f6613 + 77) % 128;
            return;
        }
        int i = f6613 + 59;
        f6612 = i % 128;
        if (i % 2 != 0) {
            webChromeClient.getVisitedHistory(valueCallback);
        } else {
            webChromeClient.getVisitedHistory(valueCallback);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        try {
            this.f6617.onCloseWindow(webView);
            f6613 = (f6612 + 107) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(Color.argb(0, 0, 0, 0) + 24, (-1) - ImageFormat.getBitsPerPixel(0), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1656)).intern(), m6873((ViewConfiguration.getWindowTouchSlop() >> 8) + 34, 321 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (28142 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
        } else {
            f6613 = (f6612 + 87) % 128;
            webChromeClient.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
        f6613 = (f6612 + 121) % 128;
        try {
            this.f6617.onConsoleMessage(str, i, str2);
            f6613 = (f6612 + 55) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(23 - TextUtils.lastIndexOf("", '0'), KeyEvent.getDeadChar(0, 0), (char) (1656 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), m6873(((byte) KeyEvent.getModifierMetaStateMask()) + 38, 852 - KeyEvent.keyCodeFromString(""), (char) (Process.myTid() >> 22)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onConsoleMessage(str, i, str2);
            return;
        }
        int i2 = f6613 + 119;
        f6612 = i2 % 128;
        if (i2 % 2 == 0) {
            webChromeClient.onConsoleMessage(str, i, str2);
            int i3 = 11 / 0;
        } else {
            webChromeClient.onConsoleMessage(str, i, str2);
        }
        f6612 = (f6613 + 19) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        int i = f6613 + 93;
        f6612 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873('H' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (1656 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), m6873(36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 250 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (5500 - ExpandableListView.getPackedPositionGroup(0L))).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6617.onCreateWindow(webView, z, z2, message);
            throw null;
        }
        this.f6617.onCreateWindow(webView, z, z2, message);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            return super.onCreateWindow(webView, z, z2, message);
        }
        f6612 = (f6613 + 83) % 128;
        return webChromeClient.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        f6613 = (f6612 + 11) % 128;
        try {
            this.f6617.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            f6613 = (f6612 + 59) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, (-1) - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1657)).intern(), m6873(44 - Color.blue(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 483, (char) (Color.rgb(0, 0, 0) + 16780143)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        } else {
            super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        try {
            this.f6617.onGeolocationPermissionsHidePrompt();
        } catch (Throwable th) {
            C2914kb.m7426(m6873(Gravity.getAbsoluteGravity(0, 0) + 24, ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (1655 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), m6873((ViewConfiguration.getLongPressTimeout() >> 16) + 55, 584 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsHidePrompt();
            return;
        }
        f6612 = (f6613 + 47) % 128;
        webChromeClient.onGeolocationPermissionsHidePrompt();
        f6613 = (f6612 + 85) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        int i = f6613 + 119;
        f6612 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873((ViewConfiguration.getTouchSlop() >> 8) + 24, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) (1655 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), m6873(TextUtils.getOffsetAfter("", 0) + 55, TextUtils.indexOf((CharSequence) "", '0') + 529, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36426)).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6617.onGeolocationPermissionsShowPrompt(str, callback);
            throw null;
        }
        this.f6617.onGeolocationPermissionsShowPrompt(str, callback);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            int i2 = f6613 + 67;
            f6612 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
        int i3 = f6613 + InterfaceC3173h3.d.b.f8821d;
        f6612 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i = f6612 + 81;
        f6613 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (1656 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), m6873(View.resolveSizeAndState(0, 0, 0) + 37, (Process.myTid() >> 22) + 213, (char) (29436 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6617.onHideCustomView();
            throw null;
        }
        this.f6617.onHideCustomView();
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onHideCustomView();
            return;
        }
        int i2 = f6613 + 43;
        f6612 = i2 % 128;
        if (i2 % 2 != 0) {
            webChromeClient.onHideCustomView();
        } else {
            webChromeClient.onHideCustomView();
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        int i = f6612 + 81;
        f6613 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(ExpandableListView.getPackedPositionGroup(0L) + 24, TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1655)).intern(), m6873(TextUtils.indexOf("", "", 0) + 30, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 353, (char) ExpandableListView.getPackedPositionType(0L)).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6617.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        this.f6617.onJsAlert(webView, str, str2, jsResult);
        f6612 = (f6613 + 25) % 128;
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            return super.onJsAlert(webView, str, str2, jsResult);
        }
        f6612 = (f6613 + 87) % 128;
        return webChromeClient.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        int i = f6613 + 119;
        f6612 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f6617.onJsBeforeUnload(webView, str, str2, jsResult);
                int i2 = 51 / 0;
            } else {
                this.f6617.onJsBeforeUnload(webView, str, str2, jsResult);
            }
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - TextUtils.getOffsetAfter("", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1655 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), m6873((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, Color.blue(0) + 447, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            return webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        boolean zOnJsBeforeUnload = super.onJsBeforeUnload(webView, str, str2, jsResult);
        int i3 = f6613 + 71;
        f6612 = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnJsBeforeUnload;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f6617.onJsConfirm(webView, str, str2, jsResult);
            f6613 = (f6612 + 75) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(((Process.getThreadPriority(0) + 20) >> 6) + 24, TextUtils.lastIndexOf("", '0') + 1, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1656)).intern(), m6873(31 - MotionEvent.axisFromString(""), 384 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (55105 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            return super.onJsConfirm(webView, str, str2, jsResult);
        }
        int i = f6612 + 43;
        f6613 = i % 128;
        if (i % 2 == 0) {
            return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        }
        webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onJsPrompt(android.webkit.WebView r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.webkit.JsPromptResult r13) {
        /*
            r8 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6613
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6612 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L2c
            android.webkit.WebChromeClient r1 = r8.f6617     // Catch: java.lang.Throwable -> L25
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.onJsPrompt(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1d
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L7c
        L1d:
            r0 = move-exception
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
        L23:
            r9 = r0
            goto L3a
        L25:
            r0 = move-exception
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            goto L23
        L2c:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            android.webkit.WebChromeClient r2 = r8.f6617     // Catch: java.lang.Throwable -> L38
            r2.onJsPrompt(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L38
            r9 = 0
            throw r9     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            goto L23
        L3a:
            int r10 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r10 = r10 >> 16
            int r10 = 24 - r10
            int r11 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r11 = r11 >> 16
            r12 = 0
            int r13 = android.os.Process.getThreadPriority(r12)
            int r13 = r13 + 20
            int r13 = r13 >> 6
            int r13 = r13 + 1656
            char r13 = (char) r13
            java.lang.String r10 = m6873(r10, r11, r13)
            java.lang.String r10 = r10.intern()
            java.lang.String r11 = ""
            int r13 = android.text.TextUtils.getTrimmedLength(r11)
            int r13 = r13 + 31
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12)
            int r0 = 416 - r0
            int r11 = android.text.TextUtils.getCapsMode(r11, r12, r12)
            int r11 = 5105 - r11
            char r11 = (char) r11
            java.lang.String r11 = m6873(r13, r0, r11)
            java.lang.String r11 = r11.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r10, r11, r9, r12)
        L7c:
            android.webkit.WebChromeClient r2 = r8.f6616
            if (r2 == 0) goto L8d
            int r9 = com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6612
            int r9 = r9 + 19
            int r9 = r9 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6613 = r9
            boolean r9 = r2.onJsPrompt(r3, r4, r5, r6, r7)
            return r9
        L8d:
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            boolean r9 = super.onJsPrompt(r9, r10, r11, r12, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2843hl.onJsPrompt(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public boolean onJsTimeout() {
        f6612 = (f6613 + 97) % 128;
        try {
            this.f6617.onJsTimeout();
            f6613 = (f6612 + 75) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - View.resolveSizeAndState(0, 0, 0), (Process.getThreadPriority(0) + 20) >> 6, (char) (1656 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), m6873(KeyEvent.normalizeMetaState(0) + 32, 820 - View.MeasureSpec.getSize(0), (char) (TextUtils.lastIndexOf("", '0') + 1571)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        return webChromeClient != null ? webChromeClient.onJsTimeout() : super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        f6613 = (f6612 + 121) % 128;
        try {
            this.f6617.onPermissionRequest(permissionRequest);
            f6613 = (f6612 + 21) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (Color.green(0) + 1656)).intern(), m6873(39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 638 - (KeyEvent.getMaxKeyCode() >> 16), (char) (KeyEvent.keyCodeFromString("") + 31)).intern(), th, false);
        }
        try {
            WebChromeClient webChromeClient = this.f6616;
            if (webChromeClient == null) {
                super.onPermissionRequest(permissionRequest);
            } else {
                f6612 = (f6613 + 87) % 128;
                webChromeClient.onPermissionRequest(permissionRequest);
            }
        } catch (Throwable th2) {
            C2914kb.m7426(m6873(Gravity.getAbsoluteGravity(0, 0) + 24, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1656)).intern(), m6873((ViewConfiguration.getTapTimeout() >> 16) + 43, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 678, (char) View.combineMeasuredStates(0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        f6612 = (f6613 + 1) % 128;
        try {
            this.f6617.onPermissionRequestCanceled(permissionRequest);
        } catch (Throwable th) {
            C2914kb.m7426(m6873((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, ExpandableListView.getPackedPositionGroup(0L), (char) (1657 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), m6873(47 - TextUtils.lastIndexOf("", '0'), ((Process.getThreadPriority(0) + 20) >> 6) + 721, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), th, false);
        }
        try {
            WebChromeClient webChromeClient = this.f6616;
            if (webChromeClient != null) {
                f6613 = (f6612 + 71) % 128;
                webChromeClient.onPermissionRequestCanceled(permissionRequest);
            } else {
                super.onPermissionRequestCanceled(permissionRequest);
                f6613 = (f6612 + 45) % 128;
            }
        } catch (Throwable th2) {
            C2914kb.m7426(m6873((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, ViewConfiguration.getTapTimeout() >> 16, (char) (1656 - TextUtils.indexOf("", "", 0, 0))).intern(), m6873(50 - MotionEvent.axisFromString(""), 769 - Color.green(0), (char) (39406 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        int i2 = f6612 + 39;
        f6613 = i2 % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(23 - TextUtils.lastIndexOf("", '0'), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (1657 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), m6873((ViewConfiguration.getFadingEdgeLength() >> 16) + 38, 24 - TextUtils.indexOf("", "", 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 30921)).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f6617.onProgressChanged(webView, i);
            throw null;
        }
        this.f6617.onProgressChanged(webView, i);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onProgressChanged(webView, i);
            return;
        }
        int i3 = f6612 + 89;
        f6613 = i3 % 128;
        if (i3 % 2 == 0) {
            webChromeClient.onProgressChanged(webView, i);
        } else {
            webChromeClient.onProgressChanged(webView, i);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i = f6612 + 91;
        f6613 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(23 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 1656)).intern(), m6873((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, ExpandableListView.getPackedPositionGroup(0L) + 98, (char) (2239 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6617.onReceivedIcon(webView, bitmap);
            throw null;
        }
        this.f6617.onReceivedIcon(webView, bitmap);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onReceivedIcon(webView, bitmap);
            int i2 = f6612 + 59;
            f6613 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = f6612 + 113;
        f6613 = i3 % 128;
        if (i3 % 2 == 0) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        } else {
            webChromeClient.onReceivedIcon(webView, bitmap);
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        int i = f6613 + 51;
        f6612 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf("", "", 0) + 1656)).intern(), m6873(36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 62 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28587)).intern(), th, false);
        }
        if (i % 2 == 0) {
            this.f6617.onReceivedTitle(webView, str);
            throw null;
        }
        this.f6617.onReceivedTitle(webView, str);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onReceivedTitle(webView, str);
        } else {
            f6613 = (f6612 + 87) % 128;
            webChromeClient.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        f6613 = (f6612 + 53) % 128;
        try {
            this.f6617.onReceivedTouchIconUrl(webView, str, z);
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1656)).intern(), m6873(43 - (ViewConfiguration.getKeyRepeatDelay() >> 16), AndroidCharacter.getMirror('0') + 'U', (char) (62477 - MotionEvent.axisFromString(""))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            f6613 = (f6612 + 77) % 128;
            webChromeClient.onReceivedTouchIconUrl(webView, str, z);
        } else {
            super.onReceivedTouchIconUrl(webView, str, z);
            f6612 = (f6613 + 51) % 128;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        f6612 = (f6613 + 91) % 128;
        try {
            this.f6617.onRequestFocus(webView);
            f6612 = (f6613 + 53) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m6873(TextUtils.indexOf("", "") + 24, TextUtils.getOffsetBefore("", 0), (char) (1657 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), m6873(35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 284, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 30502)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onRequestFocus(webView);
            return;
        }
        int i = f6613 + 57;
        f6612 = i % 128;
        if (i % 2 != 0) {
            webChromeClient.onRequestFocus(webView);
        } else {
            webChromeClient.onRequestFocus(webView);
            int i2 = 60 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int i = f6612 + 81;
        f6613 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(24 - Color.red(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1656 - View.resolveSize(0, 0))).intern(), m6873(AndroidCharacter.getMirror('0') - 11, Color.blue(0) + 176, (char) Drawable.resolveOpacity(0, 0)).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f6617.onShowCustomView(view, customViewCallback);
            throw null;
        }
        this.f6617.onShowCustomView(view, customViewCallback);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        int i2 = f6613 + InterfaceC3173h3.d.b.f8826i;
        f6612 = i2 % 128;
        if (i2 % 2 != 0) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        } else {
            webChromeClient.onShowCustomView(view, customViewCallback);
            int i3 = 19 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        f6613 = (f6612 + InterfaceC3173h3.d.b.f8819b) % 128;
        try {
            this.f6617.onShowFileChooser(webView, valueCallback, fileChooserParams);
        } catch (Throwable th) {
            C2914kb.m7426(m6873((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (1656 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), m6873(38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1017 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.getTrimmedLength("")).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        f6613 = (f6612 + 113) % 128;
        int i = f6613 + 35;
        f6612 = i % 128;
        if (i % 2 != 0) {
            return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
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
            r7 = 1395849045(0x5332f755, float:7.686537E11)
            r0 = 1
            r1 = 0
            if (r6 == r7) goto L40
            r7 = 1442029578(0x55f3a00a, float:3.3483586E13)
            if (r6 == r7) goto L11
            goto L6b
        L11:
            int r6 = android.view.Gravity.getAbsoluteGravity(r1, r1)
            int r6 = r6 + 25
            int r7 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r7 = r7 >> 16
            int r7 = 1055 - r7
            float r2 = android.view.ViewConfiguration.getScrollFriction()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            int r2 = 29271 - r2
            char r2 = (char) r2
            java.lang.String r6 = m6873(r6, r7, r2)
            java.lang.String r6 = r6.intern()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6b
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6613
            int r5 = r5 + 117
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6612 = r5
            goto L6c
        L40:
            int r6 = android.view.View.MeasureSpec.getSize(r1)
            int r6 = r6 + 20
            int r7 = android.view.View.combineMeasuredStates(r1, r1)
            int r7 = r7 + 1080
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 >> 16
            char r1 = (char) r1
            java.lang.String r6 = m6873(r6, r7, r1)
            java.lang.String r6 = r6.intern()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6b
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6612
            int r5 = r5 + 93
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2843hl.f6613 = r5
            r1 = r0
            goto L6c
        L6b:
            r1 = -1
        L6c:
            if (r1 == 0) goto L77
            if (r1 == r0) goto L72
            r5 = 0
            return r5
        L72:
            java.lang.Object r5 = r4.m6874()
            return r5
        L77:
            android.webkit.WebChromeClient r5 = r4.m6872()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2843hl.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        int i2 = f6612 + 35;
        f6613 = i2 % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m6873(KeyEvent.keyCodeFromString("") + 24, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1657)).intern(), m6873(36 - TextUtils.lastIndexOf("", '0'), 176 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f6617.onShowCustomView(view, i, customViewCallback);
            throw null;
        }
        this.f6617.onShowCustomView(view, i, customViewCallback);
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            f6613 = (f6612 + 69) % 128;
            webChromeClient.onShowCustomView(view, i, customViewCallback);
        } else {
            super.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f6617.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            C2914kb.m7426(m6873((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (View.resolveSizeAndState(0, 0, 0) + 1656)).intern(), m6873((ViewConfiguration.getLongPressTimeout() >> 16) + 37, (ViewConfiguration.getTapTimeout() >> 16) + 852, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f6616;
        if (webChromeClient != null) {
            f6613 = (f6612 + 83) % 128;
            return webChromeClient.onConsoleMessage(consoleMessage);
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        int i = f6613 + 47;
        f6612 = i % 128;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
        return zOnConsoleMessage;
    }
}
