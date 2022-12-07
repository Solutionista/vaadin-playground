/*
 * Copyright (c) 7.12.2022
 * Gabriel Sterz - Cologne, Germany
 * All rights reserved.
 */

package online.sterz.backend.textfieldformatter;

import com.vaadin.flow.component.textfield.TextField;

public abstract class AbstractPhoneFieldFormatter extends CleaveExtension {

    public static final String REGION_AC = "AC";
    public static final String REGION_AD = "AD";
    public static final String REGION_AE = "AE";
    public static final String REGION_AF = "AF";
    public static final String REGION_AG = "AG";
    public static final String REGION_AI = "AI";
    public static final String REGION_AL = "AL";
    public static final String REGION_AM = "AM";
    public static final String REGION_AO = "AO";
    public static final String REGION_AR = "AR";
    public static final String REGION_AS = "AS";
    public static final String REGION_AT = "AT";
    public static final String REGION_AU = "AU";
    public static final String REGION_AU_CN = "AU-CN";
    public static final String REGION_AW = "AW";
    public static final String REGION_AX = "AX";
    public static final String REGION_AZ = "AZ";
    public static final String REGION_BA = "BA";
    public static final String REGION_BB = "BB";
    public static final String REGION_BD = "BD";
    public static final String REGION_BE = "BE";
    public static final String REGION_BF = "BF";
    public static final String REGION_BG = "BG";
    public static final String REGION_BH = "BH";
    public static final String REGION_BI = "BI";
    public static final String REGION_BJ = "BJ";
    public static final String REGION_BL = "BL";
    public static final String REGION_BM = "BM";
    public static final String REGION_BN = "BN";
    public static final String REGION_BO = "BO";
    public static final String REGION_BQ = "BQ";
    public static final String REGION_BR = "BR";
    public static final String REGION_BS = "BS";
    public static final String REGION_BT = "BT";
    public static final String REGION_BW = "BW";
    public static final String REGION_BY = "BY";
    public static final String REGION_BZ = "BZ";
    public static final String REGION_CA = "CA";
    public static final String REGION_CC = "CC";
    public static final String REGION_CD = "CD";
    public static final String REGION_CF = "CF";
    public static final String REGION_CG = "CG";
    public static final String REGION_CH = "CH";
    public static final String REGION_CI = "CI";
    public static final String REGION_CK = "CK";
    public static final String REGION_CL = "CL";
    public static final String REGION_CM = "CM";
    public static final String REGION_CN = "CN";
    public static final String REGION_CO = "CO";
    public static final String REGION_CR = "CR";
    public static final String REGION_CU = "CU";
    public static final String REGION_CV = "CV";
    public static final String REGION_CW = "CW";
    public static final String REGION_CX = "CX";
    public static final String REGION_CY = "CY";
    public static final String REGION_CZ = "CZ";
    public static final String REGION_DE = "DE";
    public static final String REGION_DJ = "DJ";
    public static final String REGION_DK = "DK";
    public static final String REGION_DM = "DM";
    public static final String REGION_DO = "DO";
    public static final String REGION_DZ = "DZ";
    public static final String REGION_EC = "EC";
    public static final String REGION_EE = "EE";
    public static final String REGION_EG = "EG";
    public static final String REGION_EH = "EH";
    public static final String REGION_ER = "ER";
    public static final String REGION_ES = "ES";
    public static final String REGION_ET = "ET";
    public static final String REGION_FI = "FI";
    public static final String REGION_FJ = "FJ";
    public static final String REGION_FK = "FK";
    public static final String REGION_FM = "FM";
    public static final String REGION_FO = "FO";
    public static final String REGION_FR = "FR";
    public static final String REGION_GA = "GA";
    public static final String REGION_GB = "GB";
    public static final String REGION_GD = "GD";
    public static final String REGION_GE = "GE";
    public static final String REGION_GF = "GF";
    public static final String REGION_GG = "GG";
    public static final String REGION_GH = "GH";
    public static final String REGION_GI = "GI";
    public static final String REGION_GL = "GL";
    public static final String REGION_GM = "GM";
    public static final String REGION_GN = "GN";
    public static final String REGION_GP = "GP";
    public static final String REGION_GQ = "GQ";
    public static final String REGION_GR = "GR";
    public static final String REGION_GT = "GT";
    public static final String REGION_GU = "GU";
    public static final String REGION_GW = "GW";
    public static final String REGION_GY = "GY";
    public static final String REGION_HK = "HK";
    public static final String REGION_HN = "HN";
    public static final String REGION_HR = "HR";
    public static final String REGION_HT = "HT";
    public static final String REGION_HU = "HU";
    public static final String REGION_ID = "ID";
    public static final String REGION_IE = "IE";
    public static final String REGION_IL = "IL";
    public static final String REGION_IM = "IM";
    public static final String REGION_IN = "IN";
    public static final String REGION_IO = "IO";
    public static final String REGION_IQ = "IQ";
    public static final String REGION_IR = "IR";
    public static final String REGION_IS = "IS";
    public static final String REGION_IT = "IT";
    public static final String REGION_JE = "JE";
    public static final String REGION_JM = "JM";
    public static final String REGION_JO = "JO";
    public static final String REGION_JP = "JP";
    public static final String REGION_KE = "KE";
    public static final String REGION_KG = "KG";
    public static final String REGION_KH = "KH";
    public static final String REGION_KI = "KI";
    public static final String REGION_KM = "KM";
    public static final String REGION_KN = "KN";
    public static final String REGION_KP = "KP";
    public static final String REGION_KR = "KR";
    public static final String REGION_KW = "KW";
    public static final String REGION_KY = "KY";
    public static final String REGION_KZ = "KZ";
    public static final String REGION_LA = "LA";
    public static final String REGION_LB = "LB";
    public static final String REGION_LC = "LC";
    public static final String REGION_LI = "LI";
    public static final String REGION_LK = "LK";
    public static final String REGION_LR = "LR";
    public static final String REGION_LS = "LS";
    public static final String REGION_LT = "LT";
    public static final String REGION_LU = "LU";
    public static final String REGION_LV = "LV";
    public static final String REGION_LY = "LY";
    public static final String REGION_MA = "MA";
    public static final String REGION_MC = "MC";
    public static final String REGION_MD = "MD";
    public static final String REGION_ME = "ME";
    public static final String REGION_MF = "MF";
    public static final String REGION_MG = "MG";
    public static final String REGION_MH = "MH";
    public static final String REGION_MK = "MK";
    public static final String REGION_ML = "ML";
    public static final String REGION_MM = "MM";
    public static final String REGION_MN = "MN";
    public static final String REGION_MO = "MO";
    public static final String REGION_MP = "MP";
    public static final String REGION_MQ = "MQ";
    public static final String REGION_MR = "MR";
    public static final String REGION_MS = "MS";
    public static final String REGION_MT = "MT";
    public static final String REGION_MU = "MU";
    public static final String REGION_MV = "MV";
    public static final String REGION_MW = "MW";
    public static final String REGION_MX = "MX";
    public static final String REGION_MY = "MY";
    public static final String REGION_MZ = "MZ";
    public static final String REGION_NA = "NA";
    public static final String REGION_NC = "NC";
    public static final String REGION_NE = "NE";
    public static final String REGION_NF = "NF";
    public static final String REGION_NG = "NG";
    public static final String REGION_NI = "NI";
    public static final String REGION_NL = "NL";
    public static final String REGION_NO = "NO";
    public static final String REGION_NP = "NP";
    public static final String REGION_NR = "NR";
    public static final String REGION_NU = "NU";
    public static final String REGION_NZ = "NZ";
    public static final String REGION_OM = "OM";
    public static final String REGION_PA = "PA";
    public static final String REGION_PE = "PE";
    public static final String REGION_PF = "PF";
    public static final String REGION_PG = "PG";
    public static final String REGION_PH = "PH";
    public static final String REGION_PK = "PK";
    public static final String REGION_PL = "PL";
    public static final String REGION_PM = "PM";
    public static final String REGION_PR = "PR";
    public static final String REGION_PS = "PS";
    public static final String REGION_PT = "PT";
    public static final String REGION_PW = "PW";
    public static final String REGION_PY = "PY";
    public static final String REGION_QA = "QA";
    public static final String REGION_RE = "RE";
    public static final String REGION_RO = "RO";
    public static final String REGION_RS = "RS";
    public static final String REGION_RU = "RU";
    public static final String REGION_RW = "RW";
    public static final String REGION_SA = "SA";
    public static final String REGION_SB = "SB";
    public static final String REGION_SC = "SC";
    public static final String REGION_SD = "SD";
    public static final String REGION_SE = "SE";
    public static final String REGION_SG = "SG";
    public static final String REGION_SH = "SH";
    public static final String REGION_SI = "SI";
    public static final String REGION_SJ = "SJ";
    public static final String REGION_SK = "SK";
    public static final String REGION_SL = "SL";
    public static final String REGION_SM = "SM";
    public static final String REGION_SN = "SN";
    public static final String REGION_SO = "SO";
    public static final String REGION_SR = "SR";
    public static final String REGION_SS = "SS";
    public static final String REGION_ST = "ST";
    public static final String REGION_SV = "SV";
    public static final String REGION_SX = "SX";
    public static final String REGION_SY = "SY";
    public static final String REGION_SZ = "SZ";
    public static final String REGION_TA = "TA";
    public static final String REGION_TC = "TC";
    public static final String REGION_TD = "TD";
    public static final String REGION_TG = "TG";
    public static final String REGION_TH = "TH";
    public static final String REGION_TJ = "TJ";
    public static final String REGION_TK = "TK";
    public static final String REGION_TL = "TL";
    public static final String REGION_TM = "TM";
    public static final String REGION_TN = "TN";
    public static final String REGION_TO = "TO";
    public static final String REGION_TR = "TR";
    public static final String REGION_TT = "TT";
    public static final String REGION_TV = "TV";
    public static final String REGION_TW = "TW";
    public static final String REGION_TZ = "TZ";
    public static final String REGION_UA = "UA";
    public static final String REGION_UG = "UG";
    public static final String REGION_US = "US";
    public static final String REGION_UY = "UY";
    public static final String REGION_UZ = "UZ";
    public static final String REGION_VA = "VA";
    public static final String REGION_VC = "VC";
    public static final String REGION_VE = "VE";
    public static final String REGION_VG = "VG";
    public static final String REGION_VI = "VI";
    public static final String REGION_VN = "VN";
    public static final String REGION_VU = "VU";
    public static final String REGION_WF = "WF";
    public static final String REGION_WS = "WS";
    public static final String REGION_XK = "XK";
    public static final String REGION_YE = "YE";
    public static final String REGION_YT = "YT";
    public static final String REGION_ZA = "ZA";
    public static final String REGION_ZM = "ZM";
    public static final String REGION_ZW = "ZW";


    public AbstractPhoneFieldFormatter(String phoneRegionCode) {
        getConfiguration().phone = true;
        getConfiguration().phoneRegionCode = phoneRegionCode;
    }

    /**
     * Attaches this extension to a TextField. Extension cannot be moved to another
     * TextField again.
     *
     * @param textField TextField to attach this extension to
     */
    public void extend(TextField textField) {
        super.extend(textField);
    }
}