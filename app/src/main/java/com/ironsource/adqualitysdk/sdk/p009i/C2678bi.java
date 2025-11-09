package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.InputDeviceCompat;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bi */
/* loaded from: classes2.dex */
public final class C2678bi extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static int f5131 = 1;

    /* renamed from: ﻛ */
    private static long f5132;

    /* renamed from: ﾇ */
    private static char[] f5133;

    /* renamed from: ﾒ */
    private static int f5134;

    static {
        char[] cArr = new char[2053];
        ByteBuffer.wrap("8\u0000\u0083±O1\n\u008dÖ.\u0091·](\u0018¯ä\u0012¯¥k*\u0000A»ðwp2Ìîo©öei îÜA\u0097ä\u0000A»ðwp2Ìîo©öei îÜA\u0097äSV\u000eéÊe\u0085÷\u0000c»ïwm2®îa©ðep ìÜo\u0097öSi\u000eîÊ.\u0085áAdüö¸iså/wê®¦Aað\u001dpØÌ\u0094oOö\u000biÆî\u0082A=äùV´épe+÷\u0000A»äwV2éîe©÷eC ïÜn\u0097ôSr\u000eïÊl\u0085ìAeüò\u0000A»ðwp2Ìîo©öei îÜI\u0097îSt\u000eåÊr\u0085óAtüé¸tsé/aêì¦Aaã\u001dtØé\u0094vOé\u000btÆù0x\u008bÉGI\u0002õÞV\u0099ÏUP\u0010×ìp§×cM>ÜúKµÊqMÌÐ\u0088MCÐ\u001fXÚÕ\u0096xQÝ-}èÐ¤X\u007fÕ;VöÞ\u0000A»ðwp2Ìîo©öei îÜA\u0097äSC\u000eìÊi\u0085ãAküÌ¸isó/têå¦naå\u001dr%Î\u009e\u007fRÿ\u0017CËà\u008cy@æ\u0005aùÎ²kvË+fïü \u007fdãÙn\u009döVC\næÏ|\u0083ûDj8áýj±ý\u0000A»ðwp2Ìîo©öei îÜA\u0097äSR\u000eåÊw\u0085áArüä¸Lsé/sêô¦eaî\u001deØòn\u000bÕº\u0019:\\\u0086\u0080%Ç¼\u000b#N¤²\u000bù®=\u001c`£¤.ë¯/%\u0092\u009aÖ&\u001d«A3\u0084¨È+\u000f©s!¶\u0086ú#!¹e>¨¯ì$S¯\u00978\u0000A»ðwp2Ìîo©öei îÜA\u0097äSS\u000eéÊz\u0085å\u0000A»ðwp2Ìîo©öei îÜA\u0097äST\u000eùÊp\u0085å\u0000A»ðwp2Ìîo©öei îÜI\u0097îSc\u000eåÊn\u0085ôAiüö¸isú/eêä¦Iaî\u001dtØå\u0094rOó\u000btÆé\u0082t=éùa´ì¤@\u001fñÓq\u0096ÍJn\r÷Áh\u0084ïxH3ï÷uªäns!òåuXè\u001cu×è\u008b`Ní\u0002@Åå\u0000A»ðwp2Ìîo©öei îÜW\u0097åSb\u000eÖÊi\u0085åAwüÁ¸csô/iêö¦iaô\u001dy¹ÿ\u0002NÎÎ\u008brWÑ\u0010HÜ×\u0099Peÿ.Zêí·[sÌ<Hø×E]\u0001ÛÊw\u0096ÓSN\u001fÒ\u0089Ú2kþë»Wgô mìò©uUÚ\u001e\u007fÚÍ\u0087rCþ\flÈÞum1þúu¦ïcW/òèh\u0094ïQ~\u001dõÆ~\u0082é\u0000A»ðwp2Ìîo©öei îÜV\u0097éSd\u000eåÊo\u0085ÖAiüå¸w4î\u008fKCù\u0006FÚÊ\u009dXQì\u0014@èÁ£[gÝ:@þÃ±CuÊÈ]\u008cæGB\u001bßÞC\u009có'BëÂ®~rÝ5DùÛ¼\\@ó\u000bVÏð\u0092SVÁ\u0019W\u0083|8ÐôI±ðmU*çæX£Ô_F\u0000M»áwx2Éîn©ôee òÜs\u0097ôSi\u000eôÊi\u0085áAlüÁ¸d\u0000M»áwx2Òîe©÷ea òÜd\u0097åSd\u000eÁÊd\u0000M»áwx2Áîd©Öei åÜw\u0097ÉSm\u000eðÊlã.X\u0082\u0094\u001bÑ¥\r\u0016J\u008f\u0086\u000fÃ\u0090?\u0000t\u0091°\u0006í\u0086)\rf¢¢\u0007\u001fª[\u000e\u0090\u0093Ì\u000f\u0000M»áwx2Áîd©áep ôÜe\u0097òSP\u000eáÊr\u0085áAmüå¸tså/rêó¦Iaí\u001dpØì\u0000M»åwd2éîa©ôei ïÜn\u0097ÓSe\u000eòÊv\u0085éAcüå¸Isí/pêìÐékE§Üâe>ÀyEµÔðP\fÁGV\u0000M»áwx2Áîd> \u0085\u008cI\u0015\f¬Ð\t\u0097«[\u0002\u001e\u009fâ\u0000©\u008cm\u0019\u0000M»áwx2Áîd©Ìei óÜt\u0097åSn\u000eåÊr\u0000M»áwx2Áîd©Öei åÜw\u0097ÁSd\u000eÌÊi\u0085óAtüå¸nså/r\u0000M»áwx2Òîe©÷ea òÜd\u0000M»áwx2Òîe©÷ea òÜd\u0097åSd\u000eÁÊd\u0085ÌAiüó¸tså/nêå¦r\u0000M»åwd2éîa©ôei ïÜn\u0097ÁSd\u000eáÊp\u0085ôAeüò¸Bsá/sêå\u0000A»ðwp2Ìîo©öei îÜM\u0097åSd\u000eéÊa\u0085ôAiüï¸nsÁ/dêá¦paô\u001deØòUdîÌ\"MgÀ»HüÝ0@uÆ\u0089GÂè\u0006M[È\u009fYÐÝ\u0014L©Ûí{&Æz\\¿ÝóL4Û\u0000M»áwx2Áîd©Öei åÜw\u0097ÁSd\u000eáÊp\u0085ôAeüòÚða\\\u00adÅèt4ÓsI¿ØúO\u0006ÎMI\u0089ÔÔI\u0010Ô_\\\u009bÑ&|bÙ©\\õÍ0I|Ø»O\u008b&0\u008aü\u0013¹¹e\u000e\"\u009cî\n«\u0099W\u000f\u001c\u008eØ\u000f\u0085ªA\u000f\u000e\u008aÊ\u001bw\u009f3\u000eø\u0099\u0000M»áwx2Óîi©çen áÜl\u0097ÐSr\u000eïÊv\u0085éAdüå¸r6:\u008d\u0096A\u000f\u0004¶Ø\u0013\u009f\u0096S\u0007\u0016\u0083ê\u0012¡\u0085e'8\u0096ü\u0005³\u0096w\u001aÊ\u0092\u008e\u0003E\u0092\u0019\u0005Ü\u0084\u007feÄÉ\bPMé\u0091LÖÉ\u001aX_Ü£MèÚ,zqÍµ[úØ>G\u0083ÆÇ[\fÍPx\u0095ÉÙZ\u001eÉbE§Íë\\0ÍtZ¹Û\u0000M»áwx2Áîd©áep ôÜe\u0097òSS\u000eéÊg\u0085îAaüì¸Csï/lêì¦eaã\u001dtØé\u0094oOî\u000bPÆá\u0082r=áùm´åpt+åçr¢ó\u0087Ý<qðèµQiô.qâà§d[õ\u0010bÔÙ\u0089~Mù\u0002dÆù{q?üôy¨êmq!äæy\u009aÿ_~\u0013ÀÈq\u008câAq\u0005ýºu~ä3u÷â¬c\u0000M»áwx2Áîd©áep ôÜe\u0097òSL\u000eéÊs\u0085ôAeüî¸esò\u001bp ÜlE)üõY²ë~T;ØÇJ\u008cüHY\u0015ÜÑM\u009eÉZXçÏ£qhÔ4NñÉ½XzÓ\u0006XÃÏ\u0000M»áwx2Éîn©ôee òÜs\u0097ôSi\u000eôÊi\u0085áAlüÁ¸dsá/pêô¦eaò\u001dLØé\u0094sOô\u000beÆî\u0082e=òèÑS}\u009fäÚN\u0006ùAk\u008dýÈn4ø\u007fy»øæ]\"øm}©ì\u0014hPù\u009bnÇÐ\u0002uNï\u0089hõù0r|ù§n\u0000M»áwx2Óîi©çen áÜl\u0097ÃSo\u000eìÊl\u0085åAcüô¸isï/nêÌ¦iaó\u001dtØå\u0094nOå\u000brRnéÂ%[`æ¼QûÑ7LrÑUùîH\"Ègt»×üN0ÑuV\u0089úÂJ\u0006×[Y\u009fÜÐ[\u0014Ù©KíÌ&uzÙ¿VóÙ4_HÝ\u008dJL´÷\u0005;\u0085~9¢\u009aå\u0003)\u009cl\u001b\u0090·Û\u0007\u001f\u009aB\u0014\u0086\u0091É\u0016\r\u0094°\u0006ô\u0081?8c\u0094¦\u001bê\u0094-\u0012Q\u0090\u0094\u0007Ø§\u0003\u0010G\u0096\u008a\u0010Î\u009cq\u0003µ\u0090ø\u0007\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò¦Maå\u001dsØó\u0094aOç\u000beÍ\u0092v>º¼ÿ<#¤d?¨¸í2\u0011°Z%\u009e¾Ã#\u0007\u009cH4\u008c¢1\"u°¾6â´'\u0018k¼¬!Ð½\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò§¶\u001c\u0007Ð\u0087\u0095;I\u0098\u000e\u0001Â\u009e\u0087\u0019{´0\u0018ô\u009a©\u001am\u0082\"\u0019æ\u009e[\u0014\u001f\u0096Ô\u0003\u0088\u0098M\u0005\u0001¤Æ\u0002º\u0095\u007f\u00043\u0094è\u0005¬\u009ea\u0015%\u0092\u009a\u0005\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò¦Paõ\u001dbØì\u0094iOó\u000bhÆå\u0082r\u0000A»ðwp2Ìîo©öei îÜC\u0097ïSm\u000eíÊu\u0085îAiüã¸asô/oêò¦Maå\u001dsØó\u0094aOç\u000biÆî\u0082g=Óùe´òpv+éçc¢å[\u008eà?,¿i\u0003µ ò9>¦{!\u0087\u008cÌ \b¢U\"\u0091ºÞ!\u001a¦§,ã®(;t ±=ý\u008a:!F»\u0083&Ï»\u00146/ú\u0094KXË\u001dwÁÔ\u0086MJÒ\u000fUóý¸N|×!WåÈªXnÉÓ^\u0097Þ\\U\u0000ïÅS\u0089ÞNV2Þ÷_»ú`X$ÏéR\u00adÍ\u0012RÖÏ\u009bB\u0000c»ïwm2®îa©ðep ìÜo\u0097öSi\u000eîÊ.\u0085áAdüö¸iså/wê®¦Aað\u001dpØÌ\u0094oOö\u000biÆî\u0082F=õùl´ìps+ãçr¢å^e\u0019îÕT\u0090èLe\u0007íÃe~ä:Aõã±tlé(vãé\u009ftZù¿3\u0004\u009fÈ\u0006\u008d°Q\u001f\u0016\u008aÚ\u0017\u009f\u0088c\u001b(¿ì\u001a\u0000M»áwx2Îîa©ôei öÜe\u0097ÁSd\u000eÌÊi\u0085óAtüå¸nså/r\u008dl6ÀúY¿ïc@$ÕèH\u00ad×QD\u001aàÞE\u0083íGN\bÀÌEqÄ5SòàIL\u0085ÕÀc\u001cÌ[Y\u0097ÄÒ[.Èel¡Éüd8Àw]³Á\u0000M»áwx2Îîa©ôei öÜe\u0097ÁSd\u000eÖÊi\u0085åAw\u0000c»ïwm2®îa©ðep ìÜo\u0097öSi\u000eîÊ.\u0085íAeüä¸isá/têé¦oaî\u001d.Øî\u0094aOô\u000biÆö\u0082e=Áùd´óp.+Íça¢ø^N\u0019áÕt\u0090éLv\u0007åÃA~ä:Võé±el÷þÆEj\u0089óÌE\u0010êW\u007f\u009bâÞ}\"îiJ\u00adïð]4â{n¿ü\u0002IFâ\u008deÑï\u0014nXù\u0000A»ðwp2Ìîo©öei îÜN\u0097áSt\u000eéÊv\u0085åAAüäÚ¶a\u0007\u00ad\u0087è;4\u0098s\u0001¿\u009eú\u0019\u0006¹M\u0016\u0089\u0083Ô\u001e\u0010\u0081_\u0012\u009b¶&\u0013b²©\u0001õ\u00920\u0019|\u0083»;Ç\u009e\u0002\u0004N\u0083\u0095\u0012Ñ\u0099\u001c\u0012X\u0085\u0000A»ðwp2Ìîo©öei îÜN\u0097áSt\u000eéÊv\u0085åAAüä¸Sså/rêö¦iaã\u001de\u0000A»ðwp2Ìîo©öei îÜM\u0097åSd\u000eéÊa\u0085ÖAiüå¸wV½í\f!\u008cd0¸\u0093ÿ\n3\u0095v\u0012\u008aªÁ\u001d\u0005\u008fX\b\u009c±Ó\u0019\u0017\u0098ª\u0015î\u009d%*y\u0095¼\u0019ð\u008b\u0000A»ðwp2Ìîo©öei îÜN\u0097áSt\u000eéÊv\u0085åAAüä¸Isí/pêìnÔÕG\u0019Ð\\Q\u0080ËÇM\u000bÌ\u0081\u009c:\u001eö¦³\u0019o\u009e(&äì¡\u001f]é\u0016\u001eÒ¦\u008ff}§Æ1\n O\u0015\u0093°Ô\u0017\u0018¸]=¡·ê?.\u0098s=·§ø <±\u0081:Å±\u000e&·º\f,À½\u0085\bY\u00ad\u001e\u001fÒ \u0097-k¬ &ä\u0099¹%}¨20ö«K(\u000fªÄ\"\u0098\u0085] \u0011ºÖ=ª¬o'#¬ø;\u0000s»åwt2Áîd©Äei óÜp\u0097ìSa\u000eùÊL\u0085éAsüô¸esî/eêò\u0000g»åwt2Áîd©Öei åÜw\u0097ÃSo\u000eîÊt\u0085òAoüì¸lså/rs\u0011È\u0093\u0004\u0002A·\u009d\u0012Ú¿\u0016\u0012S¸¯\u0003ä\u009b \u0014}\u0093¹\u0004\u0000g»åwt2Óîi©úee}ëÆi\nøOX\u0093õÔ|\u0018éü\u008dG\u000f\u008b\u009eÎ0\u0012\u0085U\u0004\u0099\u008fÜ# \u008e\u0000g»åwt2Ãîr©åea ôÜi\u0097öSe\u000eÉÊd\u0000i»ówV2éîd©åeo ÁÜdÄÁ\u007f[³êöI*ÆmF¡ÍäZ\u0002\u0083¹\u0019u£0\u0004ì\u0089«\u000fg\u0084\"\u001eÞ\u0083\u0095\u001cQ\u0083\f\u0010È\u008f\u0087\u000eC«þ\u000e\u0097Ã,AàÐ¥eyÔ>Tòè·KKÒ\u0000MÄÊ\u0099f]Ö\u0012KÖÅk@/ÇäE¸×}P1éöE\u008aÊOE\u0003ÃØA\u009cÖ0\u0002\u008b\u0095G\u0017\u0002\u0099Þ\u0003\u0099\u0084U\u0015\u0010\u0082ì1§\u0080c\u0000>¼ú\u001fµ\u0086q\u0019Ì\u009e\u00882C\u0082\u001f\u001fÚ\u0091\u0096\u0014Q\u0093-\u0011è\u0083¤\u0004\u007f¢;\u0015ö\u0093²\u0015\r\u0099É\u0006\u0084\u0095@\u0002\u0082\u00189\u0083õ\u001f°\u0088l\n+\u0084ç\u001e¢\u0099^\b\u0015\u009fÑ,\u008c\u009dH\u001d\u0007¡Ã\u0002~\u009b:\u0004ñ\u0083\u00ad/h\u009f$\u0002ã\u008c\u009f\tZ\u008e\u0016\fÍ\u009e\u0089\u0019D¿\u0000\b¿\u008e{\b6\u0084ò\u001b©\u0088e\u001f\u0000g»åwt2Áîp©ðeL ïÜv\u0097éSn\u000eÃÊo\u0085íAmüõ¸nsé/cêá¦taï\u001drØÍ\u0094eOó\u000bsÆá\u0082g=åùD´ápt+á\u0085¬>*ò½·,k¼,-à¶¥=Yº\u0012\u000bÖ°\u008b\u001eO¯\u0000/Ä\u0093y0=©ö6ª±o\u001c#°ä2\u0098²]*\u0011±Ê6\u008e¼C>\u0007«¸0|\u00ad6ð\u008drAã\u0004YØö\u009fcSþ\u0016aêò¡Veó8Züö³~wùÊ^\u008eúEv\u0019ðÜr\u0090ÂWe+þ\u0082\u00179\u0081õ\u0010°ªl\u0005+\u0090ç\r¢\u0092^\u0001\u0015¥Ñ\u0000\u008c¡H\u0012\u0007\u0081Ã\n~\u0090:(ñ\u008d\u00ad\u0017h\u0090$\u0001ã\u008a\u009f\u0001Z\u0096\u0000g»åwt2Îîa©ôei öÜe\u0097ÁSd\u000eÉÊc\u0085ïAnüÕ¸rsé".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2053);
        f5133 = cArr;
        f5132 = 3143407519750077312L;
    }

    public C2678bi(String str) {
        super(str);
    }

    /* renamed from: ﭖ */
    private static boolean m5470(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            int i = f5134 + 33;
            f5131 = i % 128;
            if (i % 2 == 0) {
                int i2 = 67 / 0;
                if (m5477(appLovinAd) == AppLovinAdSize.BANNER) {
                    return true;
                }
            } else if (m5477(appLovinAd) == AppLovinAdSize.BANNER) {
                return true;
            }
            f5131 = (f5134 + 65) % 128;
            if (m5477(appLovinAd) == AppLovinAdSize.LEADER) {
                return true;
            }
            int i3 = f5131 + 29;
            f5134 = i3 % 128;
            if (i3 % 2 != 0) {
                m5477(appLovinAd);
                int i4 = AppLovinAdSize.SPAN;
                throw null;
            }
            if (m5477(appLovinAd) == AppLovinAdSize.MREC) {
                return true;
            }
        }
        f5131 = (f5134 + 17) % 128;
        return false;
    }

    /* renamed from: ﭴ */
    private static boolean m5471(AppLovinAd appLovinAd) {
        if (appLovinAd == null || !appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            f5134 = (f5131 + 43) % 128;
            return false;
        }
        int i = f5131 + 45;
        f5134 = i % 128;
        return i % 2 == 0;
    }

    /* renamed from: ﮌ */
    private static boolean m5472(AppLovinAd appLovinAd) {
        int i = f5134 + 89;
        f5131 = i % 128;
        int i2 = i % 2;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        if (i2 == 0) {
            int i3 = 79 / 0;
        }
        int i4 = f5134 + 119;
        f5131 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return zIsVideoAd;
    }

    /* renamed from: ﮐ */
    private static AppLovinAdType m5473(AppLovinAd appLovinAd) {
        int i = f5131 + 37;
        f5134 = i % 128;
        if (i % 2 == 0) {
            return appLovinAd.getType();
        }
        appLovinAd.getType();
        throw null;
    }

    /* renamed from: ﱟ */
    private static String m5474(AppLovinAd appLovinAd) {
        f5134 = (f5131 + 55) % 128;
        String zoneId = appLovinAd.getZoneId();
        f5134 = (f5131 + 83) % 128;
        return zoneId;
    }

    /* renamed from: ﱡ */
    private static long m5475(AppLovinAd appLovinAd) {
        int i = f5131 + 1;
        f5134 = i % 128;
        if (i % 2 == 0) {
            return appLovinAd.getAdIdNumber();
        }
        appLovinAd.getAdIdNumber();
        throw null;
    }

    /* renamed from: ﺙ */
    public static /* synthetic */ boolean m5476(AppLovinAd appLovinAd) {
        int i = f5134 + 63;
        f5131 = i % 128;
        int i2 = i % 2;
        boolean zM5471 = m5471(appLovinAd);
        if (i2 == 0) {
            int i3 = 62 / 0;
        }
        return zM5471;
    }

    /* renamed from: ﻏ */
    private static AppLovinAdSize m5477(AppLovinAd appLovinAd) {
        f5131 = (f5134 + 11) % 128;
        AppLovinAdSize size = appLovinAd.getSize();
        int i = f5131 + 9;
        f5134 = i % 128;
        if (i % 2 == 0) {
            return size;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Uri m5478(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        f5134 = (f5131 + 115) % 128;
        Uri uriM5486 = m5486(appLovinNativeAdImpl);
        int i = f5131 + 15;
        f5134 = i % 128;
        if (i % 2 == 0) {
            return uriM5486;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ AppLovinBroadcastManager m5487(Context context) {
        f5134 = (f5131 + 89) % 128;
        AppLovinBroadcastManager appLovinBroadcastManagerM5479 = m5479(context);
        int i = f5131 + 31;
        f5134 = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
        return appLovinBroadcastManagerM5479;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5493(AppLovinAd appLovinAd) {
        int i = f5131 + 121;
        f5134 = i % 128;
        if (i % 2 != 0) {
            m5474(appLovinAd);
            throw null;
        }
        String strM5474 = m5474(appLovinAd);
        int i2 = f5134 + 19;
        f5131 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM5474;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ long m5496(AppLovinAd appLovinAd) {
        int i = f5131 + 45;
        f5134 = i % 128;
        if (i % 2 != 0) {
            m5475(appLovinAd);
            throw null;
        }
        long jM5475 = m5475(appLovinAd);
        f5134 = (f5131 + 77) % 128;
        return jM5475;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ Uri m5503(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = f5134 + 91;
        f5131 = i % 128;
        if (i % 2 != 0) {
            return m5497(appLovinNativeAdImpl);
        }
        m5497(appLovinNativeAdImpl);
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5480(MaxAd maxAd) {
        int i = f5134 + 71;
        f5131 = i % 128;
        if (i % 2 != 0) {
            return m5507(maxAd);
        }
        m5507(maxAd);
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ AppLovinAdSize m5488(AppLovinAd appLovinAd) {
        f5131 = (f5134 + 5) % 128;
        AppLovinAdSize appLovinAdSizeM5477 = m5477(appLovinAd);
        int i = f5134 + 83;
        f5131 = i % 128;
        if (i % 2 != 0) {
            return appLovinAdSizeM5477;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5494(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        int i = f5131 + 115;
        f5134 = i % 128;
        int i2 = i % 2;
        m5491(appLovinBroadcastManager, receiver);
        if (i2 != 0) {
            throw null;
        }
        f5131 = (f5134 + 39) % 128;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Bundle m5498(CommunicatorMessageImpl communicatorMessageImpl) {
        int i = f5134 + 67;
        f5131 = i % 128;
        if (i % 2 != 0) {
            return m5504(communicatorMessageImpl);
        }
        m5504(communicatorMessageImpl);
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ AppLovinAdType m5506(AppLovinAd appLovinAd) {
        int i = f5131 + 83;
        f5134 = i % 128;
        int i2 = i % 2;
        AppLovinAdType appLovinAdTypeM5473 = m5473(appLovinAd);
        if (i2 != 0) {
            int i3 = 60 / 0;
        }
        int i4 = f5131 + InterfaceC3173h3.d.b.f8819b;
        f5134 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return appLovinAdTypeM5473;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5482(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i = f5134 + 87;
        f5131 = i % 128;
        int i2 = i % 2;
        m5490(appLovinInterstitialAdDialog, appLovinAdVideoPlaybackListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5489(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f5134 = (f5131 + 83) % 128;
        m5481(adViewController, appLovinAdDisplayListener);
        int i = f5134 + 77;
        f5131 = i % 128;
        if (i % 2 == 0) {
            int i2 = 52 / 0;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5495(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i = f5134 + 69;
        f5131 = i % 128;
        int i2 = i % 2;
        m5492(appLovinBroadcastManager, receiver, intentFilter);
        if (i2 == 0) {
            int i3 = 8 / 0;
        }
        int i4 = f5131 + 83;
        f5134 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ AdViewController m5499(AppLovinAdView appLovinAdView) {
        int i = f5134 + 43;
        f5131 = i % 128;
        int i2 = i % 2;
        AdViewController adViewControllerM5505 = m5505(appLovinAdView);
        if (i2 == 0) {
            int i3 = 5 / 0;
        }
        f5134 = (f5131 + 7) % 128;
        return adViewControllerM5505;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5508(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        int i = f5134 + 63;
        f5131 = i % 128;
        int i2 = i % 2;
        m5502(appLovinInterstitialAdDialog, appLovinAdClickListener);
        if (i2 == 0) {
            int i3 = 20 / 0;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5483(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i = f5134 + 47;
        f5131 = i % 128;
        int i2 = i % 2;
        m5509(appLovinNativeAdImpl, appLovinNativeAdEventListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private static void m5502(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        f5134 = (f5131 + 63) % 128;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        f5134 = (f5131 + 117) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ boolean m5510(C2678bi c2678bi, AppLovinAd appLovinAd) {
        int i = f5134 + 81;
        f5131 = i % 128;
        if (i % 2 == 0) {
            m5470(appLovinAd);
            throw null;
        }
        boolean zM5470 = m5470(appLovinAd);
        int i2 = f5134 + 21;
        f5131 = i2 % 128;
        if (i2 % 2 != 0) {
            return zM5470;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5500(View.getDefaultSize(0, 0) + 18, 1663 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32211)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5508((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdClickListener) list.get(1));
                return null;
            }
        });
        map.put(m5500(26 - KeyEvent.normalizeMetaState(0), 1681 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (47049 - Color.green(0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5482((AppLovinInterstitialAdDialog) list.get(0), (AppLovinAdVideoPlaybackListener) list.get(1));
                return null;
            }
        });
        map.put(m5500(20 - (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1707, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5489((AdViewController) list.get(0), (AppLovinAdDisplayListener) list.get(1));
                return null;
            }
        });
        map.put(m5500((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, 1728 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.16
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5499((AppLovinAdView) list.get(0));
            }
        });
        map.put(m5500((ViewConfiguration.getPressedStateDuration() >> 16) + 13, 1745 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (Color.blue(0) + 29558)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.17
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Long.valueOf(C2678bi.m5496((AppLovinAd) list.get(0)));
            }
        });
        map.put(m5500(TextUtils.lastIndexOf("", '0', 0, 0) + 8, 1759 - TextUtils.getOffsetBefore("", 0), (char) (Color.rgb(0, 0, 0) + 16777216)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.18
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5488((AppLovinAd) list.get(0));
            }
        });
        map.put(m5500(7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 1766, (char) (32141 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.20
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5506((AppLovinAd) list.get(0));
            }
        });
        map.put(m5500((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, View.getDefaultSize(0, 0) + 1773, (char) (KeyEvent.keyCodeFromString("") + 64746)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.19
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5493((AppLovinAd) list.get(0));
            }
        });
        map.put(m5500(13 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 1782, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.24
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5480((MaxAd) list.get(0));
            }
        });
        map.put(m5500(TextUtils.indexOf("", "", 0, 0) + 9, 1795 - View.MeasureSpec.getSize(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2678bi.m5485((AppLovinAd) list.get(0)));
            }
        });
        map.put(m5500((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1804, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 50345)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2678bi.m5510(C2678bi.this, (AppLovinAd) list.get(0)));
            }
        });
        map.put(m5500(Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, 1812 - TextUtils.getOffsetBefore("", 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 745)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2678bi.m5476((AppLovinAd) list.get(0)));
            }
        });
        map.put(m5500(TextUtils.indexOf("", "") + 27, (ViewConfiguration.getScrollBarSize() >> 8) + 1828, (char) (ExpandableListView.getPackedPositionGroup(0L) + 38820)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5487((Context) list.get(0));
            }
        });
        map.put(m5500((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, 1855 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 12401)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5495((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1), (IntentFilter) list.get(2));
                return null;
            }
        });
        map.put(m5500(35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1887 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33390)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5494((AppLovinBroadcastManager) list.get(0), (AppLovinBroadcastManager.Receiver) list.get(1));
                return null;
            }
        });
        map.put(m5500((ViewConfiguration.getScrollBarSize() >> 8) + 34, 1923 - (Process.myTid() >> 22), (char) Color.blue(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5498((AppLovinCommunicatorMessage) list.get(0));
            }
        });
        map.put(m5500(((Process.getThreadPriority(0) + 20) >> 6) + 31, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1956, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 34270)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5484(C2678bi.this, (Context) list.get(0), (String) list.get(1), (String) list.get(2));
                return null;
            }
        });
        map.put(m5500(MotionEvent.axisFromString("") + 24, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1989, (char) (TextUtils.lastIndexOf("", '0') + 13976)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5478((AppLovinNativeAdImpl) list.get(0));
            }
        });
        map.put(m5500(23 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionGroup(0L) + 2011, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33379)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2678bi.m5483((AppLovinNativeAdImpl) list.get(0), (AppLovinNativeAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5500((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, 2035 - Gravity.getAbsoluteGravity(0, 0), (char) View.combineMeasuredStates(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.12
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2678bi.m5503((AppLovinNativeAdImpl) list.get(0));
            }
        });
        int i = f5134 + InterfaceC3173h3.d.b.f8826i;
        f5131 = i % 128;
        if (i % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0205  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 3800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2678bi.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5484(C2678bi c2678bi, Context context, String str, String str2) {
        f5134 = (f5131 + 63) % 128;
        c2678bi.m5501(context, str, str2);
        f5131 = (f5134 + 49) % 128;
    }

    /* renamed from: ﾇ */
    private void m5501(Context context, final String str, String str2) {
        AppLovinCommunicator.getInstance(context).subscribe(new AppLovinCommunicatorSubscriber() { // from class: com.ironsource.adqualitysdk.sdk.i.bi.13
            @Override // com.applovin.communicator.AppLovinCommunicatorEntity
            public final String getCommunicatorId() {
                return str;
            }

            @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
            public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            }
        }, str2);
        int i = f5131 + 67;
        f5134 = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5131 = (f5134 + 79) % 128;
        try {
            try {
                String str = (String) AppLovinSdk.class.getDeclaredField(m5500(7 - (Process.myPid() >> 22), 1643 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28291)).intern()).get(null);
                f5131 = (f5134 + 47) % 128;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return C2849hr.m6916().m6919().m6988(AppLovinSdk.class, m5500(ImageFormat.getBitsPerPixel(0) + 13, Color.red(0) + 1651, (char) (33218 - Drawable.resolveOpacity(0, 0))).intern());
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ boolean m5485(AppLovinAd appLovinAd) {
        f5134 = (f5131 + 69) % 128;
        boolean zM5472 = m5472(appLovinAd);
        int i = f5131 + 3;
        f5134 = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return zM5472;
    }

    /* renamed from: ﾇ */
    private static Uri m5497(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = f5131 + 75;
        f5134 = i % 128;
        if (i % 2 != 0) {
            appLovinNativeAdImpl.getIconUri();
            throw null;
        }
        Uri iconUri = appLovinNativeAdImpl.getIconUri();
        f5131 = (f5134 + 7) % 128;
        return iconUri;
    }

    /* renamed from: ﻐ */
    private static void m5481(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f5134 = (f5131 + 49) % 128;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        int i = f5134 + 53;
        f5131 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private static String m5500(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5133[i2 + i3] ^ (i3 * f5132)) ^ c);
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

    /* renamed from: ﻐ */
    private static AppLovinBroadcastManager m5479(Context context) {
        int i = f5131 + 43;
        f5134 = i % 128;
        if (i % 2 != 0) {
            AppLovinBroadcastManager.getInstance(context);
            throw null;
        }
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        f5134 = (f5131 + 123) % 128;
        return appLovinBroadcastManager;
    }

    /* renamed from: ﾒ */
    private static AdViewController m5505(AppLovinAdView appLovinAdView) {
        f5131 = (f5134 + InterfaceC3173h3.d.b.f8823f) % 128;
        AdViewController adViewController = appLovinAdView.getAdViewController();
        f5134 = (f5131 + 85) % 128;
        return adViewController;
    }

    /* renamed from: ﾒ */
    private static String m5507(MaxAd maxAd) {
        int i = f5131 + 35;
        f5134 = i % 128;
        if (i % 2 == 0) {
            return maxAd.getCreativeId();
        }
        maxAd.getCreativeId();
        throw null;
    }

    /* renamed from: ﾒ */
    private static Bundle m5504(CommunicatorMessageImpl communicatorMessageImpl) {
        int i = f5131 + InterfaceC3173h3.d.b.f8826i;
        f5134 = i % 128;
        if (i % 2 == 0) {
            return communicatorMessageImpl.getMessageData();
        }
        communicatorMessageImpl.getMessageData();
        throw null;
    }

    /* renamed from: ﾒ */
    private static void m5509(AppLovinNativeAdImpl appLovinNativeAdImpl, AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        int i = f5134 + 97;
        f5131 = i % 128;
        int i2 = i % 2;
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        if (i2 == 0) {
            throw null;
        }
        f5131 = (f5134 + 19) % 128;
    }

    /* renamed from: ﻛ */
    private static void m5490(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i = f5131 + InterfaceC3173h3.d.b.f8821d;
        f5134 = i % 128;
        int i2 = i % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        if (i2 != 0) {
            int i3 = 11 / 0;
        }
    }

    /* renamed from: ﻛ */
    private static void m5492(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver, IntentFilter intentFilter) {
        int i = f5131 + InterfaceC3173h3.d.b.f8823f;
        f5134 = i % 128;
        if (i % 2 == 0) {
            throw new IncompatibleClassChangeError();
        }
        throw new IncompatibleClassChangeError();
    }

    /* renamed from: ﻛ */
    private static void m5491(AppLovinBroadcastManager appLovinBroadcastManager, AppLovinBroadcastManager.Receiver receiver) {
        f5131 = (f5134 + 123) % 128;
        throw new IncompatibleClassChangeError();
    }

    /* renamed from: ﻛ */
    private static Uri m5486(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        int i = f5134 + 57;
        f5131 = i % 128;
        if (i % 2 != 0) {
            return appLovinNativeAdImpl.getMainImageUri();
        }
        appLovinNativeAdImpl.getMainImageUri();
        throw null;
    }
}
