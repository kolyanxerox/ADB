package io.flutter.plugin.localization;

import OooO0oO.OooOo;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.shadow.okio.OooO00o;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class LocalizationPlugin {

    @NonNull
    private final Context context;

    @NonNull
    private final LocalizationChannel localizationChannel;

    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    @VisibleForTesting
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    /* renamed from: io.flutter.plugin.localization.LocalizationPlugin$1 */
    public class C44321 implements LocalizationChannel.LocalizationMessageHandler {
        public C44321() {
        }

        @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
        public String getStringResource(@NonNull String str, @Nullable String str2) {
            Context contextCreateConfigurationContext = LocalizationPlugin.this.context;
            if (str2 != null) {
                Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str2);
                Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                configuration.setLocale(localeLocaleFromString);
                contextCreateConfigurationContext = LocalizationPlugin.this.context.createConfigurationContext(configuration);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", LocalizationPlugin.this.context.getPackageName());
            if (identifier != 0) {
                return contextCreateConfigurationContext.getResources().getString(identifier);
            }
            return null;
        }
    }

    public LocalizationPlugin(@NonNull Context context, @NonNull LocalizationChannel localizationChannel) {
        C44321 c44321 = new LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            public C44321() {
            }

            @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
            public String getStringResource(@NonNull String str, @Nullable String str2) {
                Context contextCreateConfigurationContext = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeLocaleFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeLocaleFromString);
                    contextCreateConfigurationContext = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return contextCreateConfigurationContext.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = c44321;
        this.context = context;
        this.localizationChannel = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(c44321);
    }

    @NonNull
    public static Locale localeFromString(@NonNull String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] strArrSplit = str.replace('_', '-').split("-");
        builder.setLanguage(strArrSplit[0]);
        int i = 1;
        if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
            builder.setScript(strArrSplit[1]);
            i = 2;
        }
        if (strArrSplit.length > i && strArrSplit[i].length() >= 2 && strArrSplit[i].length() <= 3) {
            builder.setRegion(strArrSplit[i]);
        }
        return builder.build();
    }

    @Nullable
    public Locale resolveNativeLocale(@Nullable List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                Locale locale = locales.get(i);
                for (Locale locale2 : list) {
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                for (Locale locale3 : list) {
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Locale locale5 = locales2.get(i2);
            String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                StringBuilder sbOooOo = OooOo.OooOo(language, "-");
                sbOooOo.append(locale5.getScript());
                language = sbOooOo.toString();
            }
            if (!locale5.getCountry().isEmpty()) {
                StringBuilder sbOooOo2 = OooOo.OooOo(language, "-");
                sbOooOo2.append(locale5.getCountry());
                language = sbOooOo2.toString();
            }
            arrayList.add(OooO00o.OooOOOo(language));
            OooO00o.OooOoo0();
            arrayList.add(OooO00o.OooOOOo(locale5.getLanguage()));
            OooO00o.OooOoo0();
            arrayList.add(OooO00o.OooOOOo(locale5.getLanguage() + "-*"));
        }
        Locale localeLookup = Locale.lookup(arrayList, list);
        return localeLookup != null ? localeLookup : list.get(0);
    }

    public void sendLocalesToFlutter(@NonNull Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        this.localizationChannel.sendLocales(arrayList);
    }
}
