package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bl */
/* loaded from: classes2.dex */
public final class C2681bl extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static int f5214 = 1;

    /* renamed from: ｋ */
    private static char[] f5215;

    /* renamed from: ﾇ */
    private static int f5216;

    /* renamed from: ﾒ */
    private static long f5217;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("\u0092\u0086Ú¯\u0002êJ\u0002²(úk#ôk¨Ó«\u001b\u0007C\u0012\u008b%\u0000AHO\u0090\u0015Øî Âh£±gùCA,\u0089×Ñ×\u0019©batE<Kä\u0016¬ìTÛ\u001c£Åj\u008dH5%\u0000AHO\u0090\u0000Øè Èh²±mµ\u0081ý\u008f%Ðm4\u0095\u0000Ý{\u0004\u0091L\u008eôê<&d\u000b¬w×\u0088\u001f\u0086Gé\u008f17\u0015\u007fu¦£î\u0083\u0000AHO\u0090\u001aØè ßh£±gùCA=\u0089ñ\u0000AHO\u0090\u0004Øä Ýh¢±gù^A,X \u0010®Èå\u0080\u0005x<0Cé\u0086¡¿\u0019ÍÑ2\u0089.AJ:\u0084ò£ªÞb\u0010Ú4\u0092HK\u0094\u0000AHO\u0090%ØÕ Õh§±g\u0000AHO\u0090\u0000Øè Éh \b4@<\u0098NÐ\u0099(¿`Ó¹8ñ2I]\u0081\u0081Ù½\u0011Áj\u0017¢+\u0000BHJ\u00908Øï Éh¥±TùDA=\u0089ô6ù~Ô¦èîs\u0016U^#\u0087ÿÏÜw«¿{çW/'Tñ\u009c\u0091Ä¨\ft´Nü%%ómÓ\u0095âÝU\u0005CM#òö:Æb¼ªOÒM\u001a*Cí\u0000BHB\u00902ØÌ Íh´±jùDA6\u0089æj\u0011\"\u0011úa²\u009fJ\u009e\u0002çÛ9\u0093\u0017+eãµ»¼sî\u0000CHY\u00903Øà Øh¾±tùHA\u001e\u0089ìÑÜ\u0019´beª[\u0098\u0010Ð\u001f\bn@¿¸\u0090ðÊ):a\u0000Ù`\u008bØÃÔ\u001b³Su«Oã5:çrÕÊ½\u0002{Z^\u0092$éÔ!Ú\u0000IHE\u0090\"Øä Þh¤±vùDA,\u0089êÑÏ\u0019µbHªFò):ñ\u0082ÕÊµ\u0013c[C\u0084ÛÌÃ\u0014§\\p¤bì)5í}ÕÅ \rpUr\u009d \u001feWf\u008f\u001aÇÀ?åw¾®Yæv^\u0015\u0096ßÎÒ\u0006\u0088}\\µbÎY\u0086Z^&\u0016üîÙ¦\u0095\u007f\u007f7\\\u008f;\u0000iHD\u0090xØã Åh³±oùLA;\u0089ëÑÇ\u0019·baª\u0001ò4:ä\u0082ÄÊ²\u0013p[T£=ëã3\u009c{«Äa\fVT)\u009c§äù,ºun½\\\u0005\u0001MÝ\u0095ßÝ\u0084&{\u0000NHJ\u0090\"Øè Úh²±CùI\u0000NHJ\u0090\"Øè Úh²±NùDA+\u0089÷ÑË\u0019·baª]\u0000NHJ\u0090\"Øè Úh²±OùHA<\u0089êÑÏ\u0019\u008fbmªJò-Ò7\u009a+BD\n\u0085ò»ºÖc\u0002+,\u0093|[\u0082:iruª\u001aâÛ\u001aåR\u0088\u008b\\Ãr{/³Ñëæ#\u0096XZ\u0090zÈ\u0004\u0000Ì{\u00933\u0083ëô£([ \u0013sÊ§\u0082\u0085:øò\u000eª\u0006bk\u0019±Ñ\u008b\u0089õA!ù\u0003\u0000RHB\u00905Øé áh²±fùDA9\u0089ÕÑÇ\u0019¼bs\u0000iHD\u0090xØã Åh³±oùLA;\u0089ëÑÇ\u0019·baª\u0001ò(:ì\u0082ÓÊ³\u0013k[T£8ëî3Ó{óÄZ\fZT=\u009cáäù,ºun½\\\u0005\u0001MÝ\u0095ßÝ\u0084&{\u001a\u001aR\u000e\u008a~Â¨:\u008frË«\"ã\u0000[m\u0093ªË\u0090\u0003Ôx+°\u0017è\u007f ¿\u0098\u0095Ðã\t3\u009f\u0085×¨\u000f\u0094G\u000f¿)÷_.\u0083f Þ×\u0016\u0007N+\u0086[ý\u008d5ímØ¥\b\u001d(U^\u008c\u009cÄ¸<Ñt\u000f¬päG[\u008d\u0093ºËÅ\u0003K{\u000e³Zê\u0082\"¼\u009aãÒ7\n6Bl¹\u0099ñ¾)üa Ù7\u0011{H\u008b\u0080£øá0\u0017h/\u0000AHO©\u0001á\u00159{q¤\u0089\u0084ÁÚ\u0018-P\u0015è} ¹x\u008b°áË1\u0097Òßõ\u0007\u008aO\u001e·xÿ\u001e&ÃnðÖ\u0086\u001e@Fz\u008e\u001bõÁ=ÿe\u0088\u00ad_\u0015/]\u0003\u0084ÖÌâ4Ã|[¤qì\rSÐ\u009bæÃÁ\u000busw»\u000fâÒ*à\u0092\u0090ÚY\u0002sJ9±Ëùï!§iE\u0000MHY\u00907Øè Èh\u0093±kùLA4\u0089ìÑÉ\u0019\u0098bgª[ò3:ó\u0082ÙÊ¯\u0013\u007f\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëê3À{¼Äa\fWTp\u009cÄäÆ,¾uc½Q\u0005$Mâ\u0095×Ý\u008d&cnP¶#þîFÌ\u008e\u008a×x\u001fPg\u0010¯ö\u0000MHY\u00907Øè Èh\u009e±lùYA=\u0089ñÑÝ\u0019\u00adbmª[ò3:ä\u0082Ü¢áêõ2\u009bzD\u0082dÊ2\u0013À[õã\u0091+]sq»\u0001ÀÁ\b÷P\u009f\u0098H ph;±Ãùî\u0001\u0084IN\u0091pÙ\u0014fÖ\u0000MHY\u00907Øè Èh\u0081±kùHA/\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëê3À{¼Äa\fWTp\u009cÄäÆ,¾uc½Q\u00056Mâ\u0095ÓÝ\u0096\u0000MHY\u00907Øè Èh\u0081±kùHA/\u0089ÏÑÇ\u0019ªbpªJò4:à\u0082ÂkI#Uû:³êKò\u0003«Úi\u0092[*1âõºÅr¿\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëñ3Ó{®Ä|\f\u001dT?\u009cêäÀ,¶u|½\\\u0005\u0014Mò\u0095\u0098Ý·&mnD¶\u0016þÌFÛ\u008e\u0097×g\u001fOg\r¯û÷Ã\u0098=Ð!\bN@\u009e¸\u0091ðÕ)\fa1\u0000cHD\u0090;Ø¯ Éh¯±rùAA7\u0089ñÑË\u0019ªbpªNò9:î\u0082\u009eÊ²\u0013g[S£rëñ3Ó{®Ä|\f\u001dT?\u009cêäÀ,¶u|½\\\u0005\u0014Mò\u0095\u0098Ý·&mnD¶\u0016þÛFÑ\u008e\u0086×y\u0000MHY\u00907Øè Èh\u0096±fù{A1\u0089æÑÙ\u0006\u0017N0\u0096OÞÛ&½nÛ·\u0006ÿ5GC\u008f\u0085×¿\u001fÞd\u0004¬:ôM<\u009a\u0084êÌÆ\u0015\u0013]'¥\u0006í\u009e5´}ÈÂ\u0015\n#R\u0004\u009a°â²*Ês\u0017»%\u0003UK\u009b\u0093\u0094Ûü \u001dh4\u0000VHJ\u0090%Øõ úh¾±gùZA\u0014\u0089êÑÝ\u0019\u00adbaªAò?:÷\tbA~\u0099\u0017ÑÄ)ùa\u0094¸FðXH\u0010\u0080ÇØû\u0010\u0087kG£vû\u00053Û\u0000gHN\u0090\"ØÅ Åh¤±rùAA9\u0089úÑï\u0019½bi!ii@±,ùÙ\u0001ËI½\u0090iØL`\u0017¨éðÍ\u0000gHN\u0090\"ØÃ Ùh¹±fùAA=\u0000gHN\u0090\"ØÅ Åh¤±rùAA9\u0089ú\u0083=Ë\u0014\u0013x[\u009f£\u009fëþ2(z\u001bÂc\n R¶\u009aâá0)\u001bqe¹\u00adúw²^j2\"ÓÚÝ\u0092©K|\u0003X»:sÖ+Æã½\u0098DPM\b%ÀáxÏ0\u0087é\u007f¡RY8Ô¶\u009c\u009fDó\f\u0006ô\u0014¼be¶-\u0093\u0000gHN\u0090\"ØÀ Èh¸±oùLA1\u0089í\u0000gHN\u0090\"ØÂ Þh²±cùYA1\u0089õÑË\u0019\u0090b`ã\u0080«©sÅ;6Ã'\u008bQR\u0086\u001a¯¢Òj\u00012'úJ\u0081ªI¬\u0000gHN\u0090\"ØÀ Èh\u0083±{ù]A=\u0000gHN\u0090\"ØÒ Éh»±nùHA*\u0089ÊÑÊ\u0000sHN\u0090\"ØÈ Âh£±gù_A+\u0089÷ÑÇ\u0019\u00adbmªNò6:É\u0082ÙÊ¨\u0013r[T£2ëâ3À\u0000sHN\u0090\"ØÓ Éh ±cù_A<\u0089æÑÊ\u0019\u0095bmª\\ò.:à\u0082ÞÊ¾\u0013tt]<`ä\f¬íTã\u001c\u0097ÅB\u008df5\u0004ýá¥ém\u0084\u0016^Þd\u0086\u001aNÎöì\u0000gHN\u0090\"ØÄ Ôh£±Rù_A7\u0089÷ÑÁ\u0019\u0095bmª\\ò.)\u0005a,¹@ñ¡\t·AÁ\u0098\u0005Ð\u001chN \u0093ø¥0ÕK\u0001\u0000bHR\u0090\"Øä ÿh£±pùDA6\u0089äÑú\u0019¶bWª[ò(:ì\u0082ÞÊ¼".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1179);
        f5215 = cArr;
        f5217 = 7826944689241081899L;
    }

    public C2681bl(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    private static String m5585(Ad ad) {
        f5214 = (f5216 + 43) % 128;
        String id = ad.getId();
        f5216 = (f5214 + 73) % 128;
        return id;
    }

    /* renamed from: ﱟ */
    private static List<Any> m5586(Ad ad) {
        f5216 = (f5214 + 33) % 128;
        List<Any> extProtoList = ad.getExtProtoList();
        int i = f5216 + 17;
        f5214 = i % 128;
        if (i % 2 != 0) {
            return extProtoList;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private static Ad.Video m5587(Ad ad) {
        int i = f5214 + 71;
        f5216 = i % 128;
        int i2 = i % 2;
        Ad.Video video = ad.getVideo();
        if (i2 != 0) {
            int i3 = 39 / 0;
        }
        return video;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ ByteString m5588(Any any) {
        f5214 = (f5216 + 97) % 128;
        ByteString byteStringM5596 = m5596(any);
        f5214 = (f5216 + 17) % 128;
        return byteStringM5596;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5598(Ad ad) {
        f5216 = (f5214 + InterfaceC3173h3.d.b.f8821d) % 128;
        String strM5585 = m5585(ad);
        f5216 = (f5214 + 109) % 128;
        return strM5585;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Ad.Display m5606(Ad ad) {
        int i = f5214 + 11;
        f5216 = i % 128;
        if (i % 2 != 0) {
            m5617(ad);
            throw null;
        }
        Ad.Display displayM5617 = m5617(ad);
        f5214 = (f5216 + 115) % 128;
        return displayM5617;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5612(Ad ad, int i) {
        int i2 = f5214 + 87;
        f5216 = i2 % 128;
        if (i2 % 2 != 0) {
            m5594(ad, i);
            throw null;
        }
        String strM5594 = m5594(ad, i);
        int i3 = f5214 + 83;
        f5216 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM5594;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ Ad.Display.Banner m5616(Ad.Display display) {
        int i = f5216 + 107;
        f5214 = i % 128;
        int i2 = i % 2;
        Ad.Display.Banner bannerM5589 = m5589(display);
        if (i2 == 0) {
            int i3 = 64 / 0;
        }
        f5216 = (f5214 + 51) % 128;
        return bannerM5589;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Ad.Video m5590(Ad ad) {
        f5216 = (f5214 + 109) % 128;
        Ad.Video videoM5587 = m5587(ad);
        int i = f5216 + 107;
        f5214 = i % 128;
        if (i % 2 == 0) {
            int i2 = 7 / 0;
        }
        return videoM5587;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5601(RequestExtension requestExtension) {
        f5214 = (f5216 + 43) % 128;
        String strM5620 = m5620(requestExtension);
        int i = f5214 + 35;
        f5216 = i % 128;
        if (i % 2 == 0) {
            return strM5620;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5607(Ad.Display display) {
        int i = f5214 + 115;
        f5216 = i % 128;
        if (i % 2 != 0) {
            m5597(display);
            throw null;
        }
        String strM5597 = m5597(display);
        f5214 = (f5216 + 39) % 128;
        return strM5597;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ List m5614(Ad ad) {
        f5214 = (f5216 + 61) % 128;
        List<Any> listM5586 = m5586(ad);
        int i = f5214 + 63;
        f5216 = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
        return listM5586;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5618(Ad ad, int i) {
        int i2 = f5216 + 39;
        f5214 = i2 % 128;
        int i3 = i2 % 2;
        String strM5599 = m5599(ad, i);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return strM5599;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5592(ByteString byteString) {
        f5214 = (f5216 + 61) % 128;
        String strM5611 = m5611(byteString);
        f5214 = (f5216 + 47) % 128;
        return strM5611;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5609(AdRequestParameters adRequestParameters) {
        f5214 = (f5216 + 87) % 128;
        String strM5600 = m5600(adRequestParameters);
        int i = f5214 + 125;
        f5216 = i % 128;
        if (i % 2 == 0) {
            return strM5600;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5615(BannerView bannerView, BannerListener bannerListener) {
        int i = f5214 + 85;
        f5216 = i % 128;
        int i2 = i % 2;
        m5603(bannerView, bannerListener);
        if (i2 != 0) {
            int i3 = 26 / 0;
        }
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5619(AdRequestParameters adRequestParameters) {
        int i = f5216 + 9;
        f5214 = i % 128;
        if (i % 2 == 0) {
            m5613(adRequestParameters);
            throw null;
        }
        String strM5613 = m5613(adRequestParameters);
        int i2 = f5216 + 53;
        f5214 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM5613;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5591(KeyEvent.getDeadChar(0, 0) + 13, 928 - TextUtils.indexOf((CharSequence) "", '0'), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5607((Ad.Display) list.get(0));
            }
        });
        map.put(m5591(11 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 941, (char) (8462 - Color.red(0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5593((Ad.Video) list.get(0));
            }
        });
        map.put(m5591(9 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 953, (char) TextUtils.indexOf("", "")).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5618((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m5591(10 - TextUtils.indexOf("", ""), 962 - Gravity.getAbsoluteGravity(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5606((Ad) list.get(0));
            }
        });
        map.put(m5591(16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 972 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (33626 - Color.argb(0, 0, 0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5616((Ad.Display) list.get(0));
            }
        });
        map.put(m5591(21 - KeyEvent.getDeadChar(0, 0), 988 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64016)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5595((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m5591(8 - View.combineMeasuredStates(0, 0), 1009 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (54481 - TextUtils.getTrimmedLength(""))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5590((Ad) list.get(0));
            }
        });
        map.put(m5591(9 - Process.getGidForName(""), 1016 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.18
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5612((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m5591((ViewConfiguration.getWindowTouchSlop() >> 8) + 13, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + IronSourceError.ERROR_RV_LOAD_DURING_LOAD, (char) View.resolveSize(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5598((Ad) list.get(0));
            }
        });
        map.put(m5591((ViewConfiguration.getPressedStateDuration() >> 16) + 14, 1040 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58342)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5619((AdRequestParameters) list.get(0));
            }
        });
        map.put(m5591(9 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5609((AdRequestParameters) list.get(0));
            }
        });
        map.put(m5591(11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1064, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5601((RequestExtension) list.get(0));
            }
        });
        map.put(m5591(TextUtils.indexOf("", "", 0) + 23, Color.alpha(0) + 1074, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2681bl.m5610((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m5591(20 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1098, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2681bl.m5621((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m5591(17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16778332, (char) (29742 - Color.green(0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2681bl.m5615((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m5591(TextUtils.getOffsetAfter("", 0) + 15, 1133 - (Process.myTid() >> 22), (char) ((-1) - MotionEvent.axisFromString(""))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5614((Ad) list.get(0));
            }
        });
        map.put(m5591(Color.red(0) + 13, ImageFormat.getBitsPerPixel(0) + 1149, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 10594)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5588((Any) list.get(0));
            }
        });
        map.put(m5591(TextUtils.indexOf((CharSequence) "", '0') + 19, 1162 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2681bl.m5592((ByteString) list.get(0));
            }
        });
        int i = f5216 + 37;
        f5214 = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
        return map;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5593(Ad.Video video) {
        f5214 = (f5216 + 99) % 128;
        String strM5608 = m5608(video);
        f5214 = (f5216 + 107) % 128;
        return strM5608;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5610(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = f5214 + 87;
        f5216 = i % 128;
        int i2 = i % 2;
        m5604(interstitialAd, interstitialListener);
        if (i2 != 0) {
            int i3 = 70 / 0;
        }
    }

    /* renamed from: ﾇ */
    private static String m5611(ByteString byteString) {
        f5216 = (f5214 + 87) % 128;
        String stringUtf8 = byteString.toStringUtf8();
        int i = f5216 + 49;
        f5214 = i % 128;
        if (i % 2 == 0) {
            int i2 = 40 / 0;
        }
        return stringUtf8;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5621(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        f5214 = (f5216 + 79) % 128;
        m5605(rewardedAd, rewardedListener);
        int i = f5216 + 73;
        f5214 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ List m5595(Ad.Display.Banner banner) {
        int i = f5216 + 93;
        f5214 = i % 128;
        if (i % 2 != 0) {
            return m5602(banner);
        }
        m5602(banner);
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5613(AdRequestParameters adRequestParameters) {
        f5216 = (f5214 + 11) % 128;
        String placementId = adRequestParameters.getPlacementId();
        f5216 = (f5214 + 51) % 128;
        return placementId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:175:0x083a  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2681bl.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5214 = (f5216 + 121) % 128;
        try {
            String strM6988 = C2849hr.m6916().m6919().m6988(BidMachine.class, m5591((KeyEvent.getMaxKeyCode() >> 16) + 12, ExpandableListView.getPackedPositionGroup(0L), (char) (37592 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern());
            f5216 = (f5214 + 61) % 128;
            return strM6988;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﻐ */
    private static Ad.Display.Banner m5589(Ad.Display display) {
        int i = f5214 + 31;
        f5216 = i % 128;
        if (i % 2 != 0) {
            display.getBanner();
            throw null;
        }
        Ad.Display.Banner banner = display.getBanner();
        f5216 = (f5214 + 51) % 128;
        return banner;
    }

    /* renamed from: ﻐ */
    private static String m5594(Ad ad, int i) {
        int i2 = f5214 + 19;
        f5216 = i2 % 128;
        if (i2 % 2 == 0) {
            return ad.getAdomain(i);
        }
        ad.getAdomain(i);
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m5591(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5215[i2 + i3] ^ (i3 * f5217)) ^ c);
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
    private static Ad.Display m5617(Ad ad) {
        f5214 = (f5216 + 27) % 128;
        Ad.Display display = ad.getDisplay();
        f5216 = (f5214 + 49) % 128;
        return display;
    }

    /* renamed from: ﾒ */
    private static String m5620(RequestExtension requestExtension) {
        int i = f5214 + 5;
        f5216 = i % 128;
        if (i % 2 != 0) {
            requestExtension.getSellerId();
            throw null;
        }
        String sellerId = requestExtension.getSellerId();
        int i2 = f5216 + 109;
        f5214 = i2 % 128;
        if (i2 % 2 != 0) {
            return sellerId;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m5597(Ad.Display display) {
        f5214 = (f5216 + 85) % 128;
        String adm = display.getAdm();
        f5214 = (f5216 + 83) % 128;
        return adm;
    }

    /* renamed from: ﻛ */
    private static String m5599(Ad ad, int i) {
        f5214 = (f5216 + 17) % 128;
        String bundle = ad.getBundle(i);
        int i2 = f5214 + 125;
        f5216 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return bundle;
    }

    /* renamed from: ﻛ */
    private static List<Any> m5602(Ad.Display.Banner banner) {
        int i = f5216 + 35;
        f5214 = i % 128;
        int i2 = i % 2;
        List<Any> extProtoList = banner.getExtProtoList();
        if (i2 == 0) {
            int i3 = 68 / 0;
        }
        return extProtoList;
    }

    /* renamed from: ﻛ */
    private static ByteString m5596(Any any) {
        int i = f5214 + 65;
        f5216 = i % 128;
        if (i % 2 == 0) {
            return any.getValue();
        }
        any.getValue();
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m5600(AdRequestParameters adRequestParameters) {
        int i = f5216 + 125;
        f5214 = i % 128;
        int i2 = i % 2;
        AdsType adsType = adRequestParameters.getAdsType();
        if (i2 != 0) {
            return adsType.getName();
        }
        adsType.getName();
        throw null;
    }

    /* renamed from: ﻛ */
    private static void m5604(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i = f5216 + 23;
        f5214 = i % 128;
        int i2 = i % 2;
        interstitialAd.setListener(interstitialListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private static void m5605(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        f5216 = (f5214 + 45) % 128;
        rewardedAd.setListener(rewardedListener);
        int i = f5216 + 55;
        f5214 = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    /* renamed from: ﻛ */
    private static void m5603(BannerView bannerView, BannerListener bannerListener) {
        f5214 = (f5216 + 33) % 128;
        bannerView.setListener(bannerListener);
        int i = f5214 + 21;
        f5216 = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
    }

    /* renamed from: ｋ */
    private static String m5608(Ad.Video video) {
        f5214 = (f5216 + 3) % 128;
        String adm = video.getAdm();
        int i = f5216 + 113;
        f5214 = i % 128;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
        return adm;
    }
}
