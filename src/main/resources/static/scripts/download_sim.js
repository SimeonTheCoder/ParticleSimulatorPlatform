function copyToClip() {
    var copyText = document.getElementById("data");

    copyText.select();
    copyText.setSelectionRange(0, 99999);

    navigator.clipboard.writeText(copyText.value);
}