package com.example.razictf_2;

import java.security.MessageDigest;

public class a5 {
   public String run(int var1) {
      String[] var15 = new String[]{"!", "%", "="};
      String[] var16 = new String[]{"a", "b", "N"};
      String[] var14 = new String[]{"1", "G", "2"};
      String[] var18 = new String[]{"_", "%", "="};
      String var22 = "0";
      String[] var19 = new String[]{"C", "q", "3"};
      String[] var17 = new String[]{"4", "K", "("};
      String[] var20 = new String[]{"5", "J", "K"};
      System.out.println("a");

      String[] var23;
      for(var1 = 0; var1 < 3; ++var1) {
         for(int var2 = 0; var2 < 3; var20 = var23) {
            int var3 = 0;
            var23 = var20;
            var20 = var17;
            String[] var21 = var19;

            for(var17 = var15; var3 < 3; var23 = var19) {
               int var4 = 0;
               var19 = var23;

               String var42;
               for(var42 = var22; var4 < 3; ++var4) {
                  for(int var5 = 0; var5 < 3; ++var5) {
                     String[] var52;
                     for(int var6 = 0; var6 < 3; ++var6) {
                        for(int var7 = 0; var7 < 3; var16 = var52) {
                           int var8 = 0;

                           String var44;
                           for(var52 = var16; var8 < 3; var42 = var44) {
                              int var9 = 0;
                              var44 = var42;
                              var23 = var17;

                              String[] var24;
                              for(var24 = var18; var9 < 3; var14 = var15) {
                                 StringBuilder var43 = new StringBuilder();
                                 var43.append(var23[var1]);
                                 var43.append(var52[var2]);
                                 var43.append(var14[var3]);
                                 var43.append(var24[var4]);
                                 var43.append((new String[]{"A", "L", "D"})[var5]);
                                 var43.append((new String[]{"R", "0", "$"})[var6]);
                                 var43.append(var21[var7]);
                                 var43.append(var20[var8]);
                                 var43.append(var19[var9]);
                                 var42 = var43.toString();
                                 StringBuilder var48 = new StringBuilder();
                                 var48.append(var42);
                                 var48.append("}");
                                 String var27 = var48.toString();
                                 System.out.println(var27);

                                 String var41;
                                 label174: {
                                    boolean var13;
                                    label173: {
                                       Exception var51;
                                       label222: {
                                          Exception var10000;
                                          label170: {
                                             Exception var47;
                                             String var49;
                                             label169: {
                                                Exception var40;
                                                label213: {
                                                   int var10;
                                                   byte[] var25;
                                                   StringBuilder var28;
                                                   label167: {
                                                      Exception var45;
                                                      label214: {
                                                         MessageDigest var46;
                                                         try {
                                                            var46 = MessageDigest.getInstance("MD5");
                                                         } catch (Exception var39) {
                                                            var45 = var39;
                                                            break label214;
                                                         }

                                                         try {
                                                            var46.update(var27.getBytes());
                                                            var25 = var46.digest();
                                                            var28 = new StringBuilder();
                                                         } catch (Exception var38) {
                                                            var45 = var38;
                                                            break label214;
                                                         }

                                                         try {
                                                            var10 = var25.length;
                                                            break label167;
                                                         } catch (Exception var37) {
                                                            var45 = var37;
                                                         }
                                                      }

                                                      var18 = var14;
                                                      var40 = var45;
                                                      break label213;
                                                   }

                                                   int var11 = 0;
                                                   var15 = var14;

                                                   label155:
                                                   while(true) {
                                                      boolean var10001;
                                                      if (var11 >= var10) {
                                                         var41 = var44;
                                                         var16 = var15;

                                                         try {
                                                            var13 = var28.toString().equals("b469f80f05290ed415770ea56e69a476");
                                                            break label173;
                                                         } catch (Exception var29) {
                                                            var10000 = var29;
                                                            var10001 = false;
                                                            break label170;
                                                         }
                                                      }

                                                      var18 = var15;
                                                      var49 = var44;

                                                      label216: {
                                                         String var26;
                                                         try {
                                                            var26 = Integer.toHexString(var25[var11] & 255);
                                                         } catch (Exception var36) {
                                                            var10000 = var36;
                                                            var10001 = false;
                                                            break label216;
                                                         }

                                                         var41 = var44;

                                                         while(true) {
                                                            var18 = var15;
                                                            var49 = var41;

                                                            int var12;
                                                            try {
                                                               var12 = var26.length();
                                                            } catch (Exception var35) {
                                                               var10000 = var35;
                                                               var10001 = false;
                                                               break;
                                                            }

                                                            if (var12 >= 2) {
                                                               var49 = var41;
                                                               var41 = var41;
                                                               var16 = var15;

                                                               try {
                                                                  var28.append(var26);
                                                               } catch (Exception var30) {
                                                                  var10000 = var30;
                                                                  var10001 = false;
                                                                  break label170;
                                                               }

                                                               ++var11;
                                                               var44 = var49;
                                                               continue label155;
                                                            }

                                                            StringBuilder var50;
                                                            try {
                                                               var50 = new StringBuilder();
                                                            } catch (Exception var34) {
                                                               var47 = var34;
                                                               var49 = var41;
                                                               break label169;
                                                            }

                                                            var49 = var41;
                                                            var41 = var41;
                                                            var16 = var15;

                                                            try {
                                                               var50.append(var49);
                                                            } catch (Exception var33) {
                                                               var10000 = var33;
                                                               var10001 = false;
                                                               break label170;
                                                            }

                                                            var41 = var49;
                                                            var16 = var15;

                                                            try {
                                                               var50.append(var26);
                                                            } catch (Exception var32) {
                                                               var10000 = var32;
                                                               var10001 = false;
                                                               break label170;
                                                            }

                                                            var41 = var49;
                                                            var16 = var15;

                                                            try {
                                                               var26 = var50.toString();
                                                            } catch (Exception var31) {
                                                               var10000 = var31;
                                                               var10001 = false;
                                                               break label170;
                                                            }

                                                            var41 = var49;
                                                         }
                                                      }

                                                      var40 = var10000;
                                                      var44 = var49;
                                                      break;
                                                   }
                                                }

                                                var15 = var18;
                                                var49 = var44;
                                                var47 = var40;
                                             }

                                             var41 = var49;
                                             var51 = var47;
                                             break label222;
                                          }

                                          var51 = var10000;
                                          var15 = var16;
                                       }

                                       var51.printStackTrace();
                                       break label174;
                                    }

                                    var41 = var44;
                                    if (var13) {
                                       return var27;
                                    }
                                 }

                                 ++var9;
                                 var44 = var41;
                              }

                              ++var8;
                              var18 = var24;
                              var17 = var23;
                           }

                           ++var7;
                        }
                     }
                  }
               }

               ++var3;
               var22 = var42;
            }

            ++var2;
            var15 = var17;
            var19 = var21;
            var17 = var20;
         }
      }

      return "y";
   }
}
