import instances.Audio;
import instances.Image;
import instances.Media;
import instances.Video;

import java.util.Scanner;

public class PlayerMulti {
    static void main() {
        Media[] medias = new Media[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creiamo la tua playlistMix");
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Cosa vuoi creare? 1 Video, 2 Audio, 3 Immagine");
            int choice = 0;
            while (true) {
                int choiceWhile = Integer.parseInt(scanner.nextLine());
                if ((choiceWhile < 1) || (choiceWhile > 3)) {
                    System.out.println("Valore non valido");
                    System.out.println("Cosa vuoi creare? 1 Video, 2 Audio, 3 Immagine");
                } else {
                    choice = choiceWhile;
                    break;
                }
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Creiamo un video");
                    System.out.println("Dimmi il titolo");
                    String outVideoTitle = "";
                    while (true) {
                        System.out.println("(max 30 caratteri)");
                        String videoTitle = scanner.nextLine();
                        if (videoTitle.length() > 30) {
                            System.out.println("Il titolo del video è troppo lungo");
                        } else {
                            outVideoTitle = videoTitle;
                            break;
                        }
                    }
                    System.out.println("Quanto dura il video (max 15 sec)");
                    int totalTime = 0;
                    while (true) {
                        int time = Integer.parseInt(scanner.nextLine());
                        if (time > 15 || time < 0) {
                            System.out.println("Il tempo non va bene");
                        } else {
                            totalTime = time;
                            break;
                        }
                    }
                    System.out.println("Vuoi aggiustare il suo volume?");
                    System.out.println("y O n?");
                    String responseVol = scanner.nextLine();
                    int initialVolume = 5;
                    if (responseVol.equals("y") || responseVol.equals("Y")) {
                        while (true) {
                            System.out.println(" (min 0 - Default 5 - max 10)");
                            int volume = Integer.parseInt(scanner.nextLine());
                            if (volume > 10 || volume < 0) {
                                System.out.println("Volume non valido");
                            } else {
                                initialVolume = volume;
                                break;
                            }
                        }
                    }
                    System.out.println("Vuoi cambiare la luminosità al video?");
                    System.out.println("y O n?");
                    String responseBri = scanner.nextLine();
                    int initialBright = 5;

                    if (responseBri.equals("y")) {
                        while (true) {
                            System.out.println("(min 0 - Default 5 - max 10)");
                            int brightness = Integer.parseInt(scanner.nextLine());
                            if (brightness > 10 || brightness < 0) {
                                System.out.println("Luminosità non valida");
                            } else {
                                initialBright = brightness;
                                break;
                            }
                        }
                    }

                    medias[i] = new Video(initialBright, outVideoTitle, totalTime, initialVolume);

                }
                case 2 -> {
                    System.out.println("Creiamo un audio");
                    System.out.println("Dimmi il titolo");
                    String outAudioTitle = "";
                    while (true) {
                        System.out.println("(max 30 caratteri)");
                        String audioTitle = scanner.nextLine();
                        if (audioTitle.length() > 30) {
                            System.out.println("Il titolo del audio è troppo lungo");
                        } else {
                            outAudioTitle = audioTitle;
                            break;
                        }
                    }
                    System.out.println("Quanto dura l'audio (max 15 sec)");
                    int totalTime = 0;
                    while (true) {
                        int time = Integer.parseInt(scanner.nextLine());
                        if (time > 15 || time < 0) {
                            System.out.println("Il tempo non va bene");
                        } else {
                            totalTime = time;
                            break;
                        }
                    }
                    System.out.println("Vuoi aggiustare il suo volume?");
                    System.out.println("y O n?");
                    String responseVol = scanner.nextLine();
                    int initialVolume = 5;
                    if (responseVol.equals("y") || responseVol.equals("Y")) {
                        while (true) {
                            System.out.println(" (min 0 - Default 5 - max 10)");
                            int volume = Integer.parseInt(scanner.nextLine());
                            if (volume > 10 || volume < 0) {
                                System.out.println("Volume non valido");
                            } else {
                                initialVolume = volume;
                                break;
                            }
                        }
                    }
                    medias[i] = new Audio(initialVolume, totalTime, outAudioTitle);
                }
                case 3 -> {
                    System.out.println("Creiamo un immagine");
                    System.out.println("Dimmi il titolo");
                    String outImageTitle = "";
                    while (true) {
                        System.out.println("(max 30 caratteri)");
                        String imageTitle = scanner.nextLine();
                        if (imageTitle.length() > 30) {
                            System.out.println("Il titolo dell'immagine è troppo lungo");
                        } else {
                            outImageTitle = imageTitle;
                            break;
                        }
                    }
                    System.out.println("Vuoi cambiare la luminosità all'immagine? (min 0 - Default 5 - max 10)");
                    System.out.println("y O n?");
                    String responseBri = scanner.nextLine();
                    int initialBright = 5;
                    if (responseBri.equals("y") || responseBri.equals("Y")) {
                        while (true) {
                            System.out.println("(min 0 - Default 5 - max 10)");
                            int brightness = Integer.parseInt(scanner.nextLine());
                            if (brightness > 10 || brightness < 0) {
                                System.out.println("Luminosità non valida");
                            } else {
                                initialBright = brightness;
                                break;
                            }
                        }
                    }
                    medias[i] = new Image(initialBright, outImageTitle);
                }
                default -> System.out.println("Valore non valido");
            }

        }
        System.out.println("Bene, abbiamo creato la tua playlist, scegli cosa vuoi vedere o ascoltare!");
        while (true) {
            System.out.println("Dammi un numero da 1 a 5, (9 per uscire)");

            int arrayChoice = Integer.parseInt(scanner.nextLine());
            if (arrayChoice == 9) {
                System.out.println("Ci vediamo!");
                break;
            } else if (arrayChoice < 1 || arrayChoice > 5) {
                System.out.println("Valore non valido");
            } else {
                --arrayChoice;
                if (medias[arrayChoice] instanceof Image image) {
                    image.show();
                } else if (medias[arrayChoice] instanceof Audio audio) {
                    audio.play();
                } else if (medias[arrayChoice] instanceof Video video) {
                    video.play();
                }
            }
        }
    }


}
//        Video int brightness, String title, int duration, int volume
//        Audio String title, int duration, int volume
//        Image int brightness, String title
