{ pkgs, lib, config, inputs, ... }:

{
  packages = with pkgs; [

  ];

  android = {
    enable = true;
    android-studio = {
      enable = true;
    };

    buildTools = {
      version = [ "35.0.0" ];
    };

    platforms = {
      version = [ "35" ];
    };
  };

  languages = {
    elm = {
      enable = true;
    };
    java = {
      gradle = {
        enable = true;
      };
    };
    javascript = {
      enable = true;
      npm = {
        enable = true;
      };
    };
  };

  # See full reference at https://devenv.sh/reference/options/
}
